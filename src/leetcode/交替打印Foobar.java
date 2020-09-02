package leetcode;

import java.util.concurrent.Semaphore;

public class 交替打印Foobar {
    private int n;

    public 交替打印Foobar(int n) {
        this.n = n;
    }

    boolean flag = false;
    Semaphore semaphorefoo = new Semaphore(0);
    Semaphore semaphorebar = new Semaphore(0);

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            // printFoo.run() outputs "foo". Do not change or remove this line.
            if (!flag) {

                flag = !flag;
            } else {
                
                semaphorefoo.acquire();
            }
            printFoo.run();
            semaphorebar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printBar.run() outputs "bar". Do not change or remove this line.
            semaphorebar.acquire();
            printBar.run();
            semaphorefoo.release();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        交替打印Foobar test = new 交替打印Foobar(2);
        test.bar(() -> System.out.println("bar"));
        test.foo(() -> System.out.println("foo"));
    }
}
