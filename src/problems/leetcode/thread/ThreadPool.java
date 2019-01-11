package problems.leetcode.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void executorService() throws InterruptedException {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(10);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5,5,1, TimeUnit.MILLISECONDS,queue);
        poolExecutor.execute(() -> {
            System.out.println("one running...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        poolExecutor.execute(() -> {
            System.out.println("two running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        poolExecutor.shutdown();
        while (!poolExecutor.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("thread is still running...");
        }
        System.out.println("main is over.");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPool.executorService();
    }
}
