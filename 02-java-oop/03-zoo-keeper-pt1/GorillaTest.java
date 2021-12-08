

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla g = new Gorilla(100);
        g.throwSomething();
        g.displayEnergy();

        g.climb();
        g.displayEnergy();

        g.eatBanana();
        g.displayEnergy();
    }
}
