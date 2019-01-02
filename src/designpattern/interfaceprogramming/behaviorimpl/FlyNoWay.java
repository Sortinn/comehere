package designpattern.interfaceprogramming.behaviorimpl;

import designpattern.interfaceprogramming.behaviorinterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
