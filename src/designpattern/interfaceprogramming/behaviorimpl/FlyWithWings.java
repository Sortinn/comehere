package designpattern.interfaceprogramming.behaviorimpl;

import designpattern.interfaceprogramming.behaviorinterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
