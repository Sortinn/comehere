package designpattern.interfaceprogramming;

import designpattern.interfaceprogramming.behaviorinterface.FlyBehavior;
import designpattern.interfaceprogramming.behaviorinterface.QuarkBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuarkBehavior quarkBehavior;

    public Duck() {

    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuark() {
        quarkBehavior.quark();
    }

    public abstract void display();

    public void swimming() {
        System.out.println("All ducks float, eben decoys!");
    }


}
