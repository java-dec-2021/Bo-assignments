public class PokemonTest {

    public static void main(String[] args) {
        
        Pokemon pokemon = new Pokemon("Bo", 100, "Ape");
        System.out.println(pokemon.getName());
        System.out.println(pokemon.getCount());
    
        Pokemon poke = new Pokemon("Sin", 50, "Bird");
        System.out.println(poke.getName());
        System.out.println(poke.getCount());

        pokemon.setName("Jangles");
        poke.setName("Jizzle");

        System.out.println(pokemon.getName());
        System.out.println(poke.getName());
    }
}



