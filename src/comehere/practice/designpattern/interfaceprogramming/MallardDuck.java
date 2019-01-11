package comehere.practice.designpattern.interfaceprogramming;

import comehere.practice.designpattern.interfaceprogramming.behaviorimpl.FlyWithWings;
import comehere.practice.designpattern.interfaceprogramming.behaviorimpl.Quark;

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
