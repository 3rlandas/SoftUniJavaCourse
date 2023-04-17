public class Pokemon {
    private String pokemonName;
    private String pokemonType;


    public Pokemon(String pokemonName, String pokemonType){
       this.pokemonName = pokemonName;
       this.pokemonType = pokemonType;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public String getPokemonName() {
        return pokemonName;
    }
    @Override
    public String toString() {
        return this.getPokemonName() + " " + this.getPokemonType();
    }
}
