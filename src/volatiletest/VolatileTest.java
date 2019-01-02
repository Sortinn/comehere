package volatiletest;

import java.util.Scanner;

public class VolatileTest implements Runnable {

    private  volatile Boolean flag = true;

    @Override
    public void run() {
        while (flag) {
        }
        System.out.println(Thread.currentThread().getName() + " 执行完毕...");
    }

    private void stopRun() {
        flag = false;
    }

    public static void main(String[] args) {
        VolatileTest volatileTest = new VolatileTest();
        new Thread(volatileTest, "Thread A").start();

        System.out.println("main 线程正在运行...");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String value = sc.next();
            if (value.equals("1")) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        volatileTest.stopRun();
                    }
                }).start();
                break;
            }
        }
        System.out.println("main 线程执行完毕...");
    }
}
