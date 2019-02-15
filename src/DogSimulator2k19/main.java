package DogSimulator2k19;

import DogSimulator2k19.BarkBehaviour.NormalBark;
import DogSimulator2k19.Dogs.Dog;
import DogSimulator2k19.Dogs.GoldenDog;
import DogSimulator2k19.Dogs.Labrador;

public class main {
    public static void main(String[] args) {
        Dog labrador = new Labrador();
        Dog goldenWoofer = new GoldenDog();

        labrador.colour();
        labrador.doBark();

        goldenWoofer.colour();
        goldenWoofer.doBark();

        //Magic Happens
        goldenWoofer.setBarkBehaviour(new NormalBark());

        goldenWoofer.doBark();
    }
}
