package practice.designpattern.interfaceprogramming;

import practice.designpattern.interfaceprogramming.behaviorimpl.FlyWithWings;
import practice.designpattern.interfaceprogramming.behaviorimpl.Quark;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quarkBehavior = new Quark();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
