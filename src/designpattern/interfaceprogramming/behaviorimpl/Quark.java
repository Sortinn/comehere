package designpattern.interfaceprogramming.behaviorimpl;

import designpattern.interfaceprogramming.behaviorinterface.QuarkBehavior;

public class Quark implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("Quark!");
    }
}
