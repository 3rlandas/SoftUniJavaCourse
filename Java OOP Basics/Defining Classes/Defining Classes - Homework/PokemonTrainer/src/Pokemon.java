public class Pokemon {

    private String name;
    private String element;
    private int health;

    public int getHealth() {
        return health;
    }

    public String getElement() {
        return element;
    }

    public String getName() {
        return name;
    }

    public Pokemon(String pokemonName, String pokemonElement, int pokemonHealth) {
        this.name = pokemonName;
        this.element = pokemonElement;
        this.health = pokemonHealth;
    }
}
