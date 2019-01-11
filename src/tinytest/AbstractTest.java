package tinytest;

public  class AbstractTest {
    public void test1() {
        System.out.println("非抽象方法");
    }

    public static void test2(){
        System.out.println("静态方法");
    }


    public static void main(String[] args) {
        synchronized (AbstractTest.class){
            System.out.println("Synchronize");
        }
    }
}
