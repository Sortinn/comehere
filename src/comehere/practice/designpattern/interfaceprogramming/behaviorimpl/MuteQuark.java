package comehere.practice.designpattern.interfaceprogramming.behaviorimpl;

import comehere.practice.designpattern.interfaceprogramming.behaviorinterface.QuarkBehavior;

public class MuteQuark implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("<<Silence>>");
    }
}
