package comehere.practice.designpattern.interfaceprogramming.behaviorimpl;

import comehere.practice.designpattern.interfaceprogramming.behaviorinterface.QuarkBehavior;

public class Squeak implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("Squeak!");
    }
}
