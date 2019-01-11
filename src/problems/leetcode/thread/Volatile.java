package problems.leetcode.thread;

import java.util.concurrent.TimeUnit;

public class Volatile implements Runnable {
    private static volatile boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println(Thread.currentThread().getName() + " is running...");
        }
        System.out.println(Thread.currentThread().getName() + " stopped.");
    }

    public static void main(String[] args) {
        Volatile aVoaltile = new Volatile();
        new Thread(aVoaltile, "Volatile Thread").start();
        System.out.println(" main Thread is running...");
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = false;
    }

}
