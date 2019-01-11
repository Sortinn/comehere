package tinytest.statictest;

public class A {

    public A() {
        System.out.println("Class A constructor");
    }

    static {
        System.out.println("Class A static statement");
    }

    {
        System.out.println("This is class A 的复合语句");
    }


}