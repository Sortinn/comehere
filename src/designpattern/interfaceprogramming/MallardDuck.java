package designpattern.interfaceprogramming;

import designpattern.interfaceprogramming.behaviorimpl.FlyWithWings;
import designpattern.interfaceprogramming.behaviorimpl.Quark;

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
