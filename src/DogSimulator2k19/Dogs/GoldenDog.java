package DogSimulator2k19.Dogs;

import DogSimulator2k19.BarkBehaviour.NoBark;

public class GoldenDog extends Dog {

    public GoldenDog() {
        setBarkBehaviour(new NoBark());
    }

    @Override
    public void colour() {
        System.out.println("Real Metallic Golden");
    }
}
