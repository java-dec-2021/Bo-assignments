

public class Pokemon {
    private String name;
    private int health;
    private String type;  
    private static int count; // Why does it only work with 'protected'

    public Pokemon(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
        // System.out.println(count);
    }

    public void attackPokemon(Pokemon target) {
        target.health -= 10;
        System.out.println(target + " attacked.  Health is now: " + target.health);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth(int health) {
        return health;
    }

    public int getCount() {
        return count;
    }



}
