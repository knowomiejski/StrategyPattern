package DogSimulator2k19.Dogs;

import DogSimulator2k19.BarkBehaviour.BarkBehaviour;
import DogSimulator2k19.BarkBehaviour.NormalBark;

public abstract class Dog {
    private BarkBehaviour barkBehaviour;

    public Dog() {
        this.barkBehaviour = new NormalBark();
    }

    public void setBarkBehaviour(BarkBehaviour barkBehaviour) {
        this.barkBehaviour = barkBehaviour;
    }

    public void doBark() {
        this.barkBehaviour.bark();
    }

    public abstract void colour();
}
