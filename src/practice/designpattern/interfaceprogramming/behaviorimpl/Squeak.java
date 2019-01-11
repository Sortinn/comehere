package practice.designpattern.interfaceprogramming.behaviorimpl;

import practice.designpattern.interfaceprogramming.behaviorinterface.QuarkBehavior;

public class Squeak implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("Squeak!");
    }
}
