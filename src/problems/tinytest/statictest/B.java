package problems.tinytest.statictest;

public class B extends A {

    public B() {
        System.out.println("Class B constructor");
    }

    static {
        System.out.println("Class B static statement");
    }

    {
        System.out.println("This is class B 的复合语句");
    }
    public static void main(String[] args) {
        B b = new B();
    }
}
