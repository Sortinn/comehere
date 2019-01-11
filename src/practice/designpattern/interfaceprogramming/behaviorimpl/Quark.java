package practice.designpattern.interfaceprogramming.behaviorimpl;

import practice.designpattern.interfaceprogramming.behaviorinterface.QuarkBehavior;

public class Quark implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("Quark!");
    }
}
