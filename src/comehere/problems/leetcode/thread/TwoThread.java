package comehere.problems.leetcode.thread;

//public class TwoThread {
//    private int number;
//    private boolean flag = false;
//
//    public static class EvenNumber implements Runnable {
//
//        TwoThread twoThread = new TwoThread();
//
//
//        public EvenNumber(TwoThread twoThread) {
//            this.twoThread = twoThread;
//        }
//
//        @Override
//        public void run() {
//            while (twoThread.number <= 100) {
//                synchronized (TwoThread.class) {
//                    System.out.println("偶数线程得到锁!");
//                    if (twoThread.flag) {
//                        System.out.println(Thread.currentThread().getName() + " " + twoThread.number);
//                        twoThread.number++;
//                        TwoThread.class.notify();
//                    } else {
//                        try {
//                            TwoThread.class.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    public static class OddNumber implements Runnable {
//
//        TwoThread twoThread = new TwoThread();
//
//        public OddNumber(TwoThread twoThread) {
//            this.twoThread = twoThread;
//        }
//
//        @Override
//        public void run() {
//            while (twoThread.number <= 100) {
//                synchronized (TwoThread.class) {
//                    System.out.println("奇数线程得到锁!");
//                    if (!twoThread.flag) {
//                        System.out.println(Thread.currentThread().getName() + " " + twoThread.number);
//                        twoThread.number++;
//                        twoThread.flag = true;
//                    } else {
//                        try {
//                            TwoThread.class.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        TwoThread twoThread = new TwoThread();
//        Thread evenNumber = new Thread(new EvenNumber(twoThread));
//        evenNumber.setName("偶数打印");
//        Thread oddNumber = new Thread(new OddNumber(twoThread));
//        oddNumber.setName("奇数打印");
//        evenNumber.start();
//        oddNumber.start();
//
//
//    }
//
//}
public class TwoThread {

    private int start = 1;

    private boolean flag = false;

    public static void main(String[] args) {
        TwoThread twoThread = new TwoThread();

        Thread t1 = new Thread(new OuNum(twoThread));
        t1.setName("偶数线程");


        Thread t2 = new Thread(new JiNum(twoThread));
        t2.setName("奇数线程");

        t1.start();
        t2.start();
    }

    /**
     * 偶数线程
     */
    public static class OuNum implements Runnable {
        private TwoThread number;

        public OuNum(TwoThread number) {
            this.number = number;
        }

        @Override
        public void run() {

            while (number.start <= 100) {
                synchronized (TwoThread.class) {
                    System.out.println("偶数线程抢到锁了");
                    if (number.flag) {
                        System.out.println(Thread.currentThread().getName() + "+-+偶数" + number.start);
                        number.start++;

                        number.flag = false;
                        TwoThread.class.notify();

                    }else {
                        try {
                            TwoThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }
    }


    /**
     * 奇数线程
     */
    public static class JiNum implements Runnable {
        private TwoThread number;

        public JiNum(TwoThread number) {
            this.number = number;
        }

        @Override
        public void run() {
            while (number.start <= 100) {
                synchronized (TwoThread.class) {
                    System.out.println("奇数线程抢到锁了");
                    if (!number.flag) {
                        System.out.println(Thread.currentThread().getName() + "+-+奇数" + number.start);
                        number.start++;

                        number.flag = true;

                        TwoThread.class.notify();
                    }else {
                        try {
                            TwoThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}