

public class Bat {
    int energyLevel = 300;

    public Bat() {}

    public Bat(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public void fly() {
        System.out.println("Bat taking flight:  click... click... click...");
        energyLevel -= 50;
    }

    public void eatHumans() {
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Ahhhh... Ohhh Nooo... We are being attacked by a giant bat!!!!!   Run for your lives!!!!!");
        energyLevel -= 100;
    }

    public void displayEnergyLevel() {
        System.out.println("Energy Level: " + energyLevel);
    }
}
