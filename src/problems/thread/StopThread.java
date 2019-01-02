package problems.thread;

import java.util.concurrent.TimeUnit;

public class StopThread implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().getName() + " is running...");
        }
        System.out.println(Thread.currentThread().getName() + " is interrupted!");
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable aStopThread = new StopThread();
        Thread thread = new Thread(aStopThread, "stop thread");
        thread.start();
        System.out.println("main thread is running...");
        TimeUnit.MILLISECONDS.sleep(10000);
        thread.interrupt();
    }
}
