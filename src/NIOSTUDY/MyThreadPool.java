package NIOSTUDY;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyThreadPool {
    BlockingQueue<Runnable> workQueue;
    List<WorkThread> threads = new ArrayList<>();

    MyThreadPool(int poolSize, BlockingQueue<Runnable> workQueue) {
        this.workQueue = workQueue;
        for (int i = 0; i < poolSize; i++) {
            WorkThread thread = new WorkThread();
            thread.start();
            threads.add(thread);
        }
    }

    public void execute(Runnable command) throws InterruptedException {
        workQueue.put(command);
    }

    class WorkThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Runnable task = workQueue.take();
                    task.run();
                } catch (InterruptedException e) {
                    currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(2);
        MyThreadPool myThreadPool  = new MyThreadPool(10, workQueue);
        myThreadPool.execute(()->{
            System.out.println("hello world");
        });
        myThreadPool.execute(()->{
            System.out.println("hello world2");
        });

    }
}
