package volatiletest;


import java.util.concurrent.atomic.AtomicInteger;

public class VolatileNotThreadSafe implements Runnable {
    private static volatile AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {

            //Atomically increments by one the current value.
            count.getAndIncrement();
        }

        System.out.println(Thread.currentThread().getName() + "更新count为: " + count);
    }


    public static void main(String[] args) {
        Runnable test = new VolatileNotThreadSafe();
        Thread A = new Thread(test, "Thread A");
        Thread B = new Thread(test, "Thread B");

        A.start();
        B.start();

        for (int i = 0; i < 10000; i++) {
            count.getAndIncrement();
        }

        System.out.println("count最终为: " + count);

    }


}
