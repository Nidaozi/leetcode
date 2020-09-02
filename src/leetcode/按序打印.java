package leetcode;

import java.util.concurrent.CountDownLatch;

public class 按序打印 {

    CountDownLatch A = new CountDownLatch(1);
    CountDownLatch B = new CountDownLatch(1);
    public  void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        A.countDown();
    }

    public  void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        A.await();
        printSecond.run();
        B.countDown();
    }

    public  void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        B.await();
        printThird.run();
    }
}
