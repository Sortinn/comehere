package practice.designpattern.interfaceprogramming.behaviorimpl;

import practice.designpattern.interfaceprogramming.behaviorinterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
