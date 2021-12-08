

public class Gorilla extends Mammal {

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public void throwSomething() {
        System.out.println("Gorilla threw something!");
        energyLevel -= 5;
    }

    public void eatBanana() {
        System.out.println("Eating a banana");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("Gorilla climbing");
        energyLevel -= 10;
    }
}




