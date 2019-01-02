package designpattern.interfaceprogramming.behaviorimpl;

import designpattern.interfaceprogramming.behaviorinterface.QuarkBehavior;

public class MuteQuark implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("<<Silence>>");
    }
}
