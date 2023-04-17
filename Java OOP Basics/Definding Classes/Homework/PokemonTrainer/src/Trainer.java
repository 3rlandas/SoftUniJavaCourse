import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {

    private String name;
    private int numberOfBadges;
    private ArrayList<Pokemon> collectionOfPokemon;

    public String getName(){
        return name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public ArrayList<Pokemon> getCollectionOfPokemon() {
        return collectionOfPokemon;
    }


    public Trainer(String trainerName) {
        this.name = trainerName;
        this.numberOfBadges = 0;
        this.collectionOfPokemon = new ArrayList<>();
    }
    public int getNumberOfElements(String element){

        List<Pokemon> t = new ArrayList<>();
        t = collectionOfPokemon.stream()
                .filter(p -> p.getElement().equals(element))
                .collect(Collectors.toList());

        return t.size();
    }

    public void loseHealth(){
        this.collectionOfPokemon = (ArrayList<Pokemon>) this.collectionOfPokemon
                .stream().map(p -> new Pokemon(p.getName(), p.getElement(), p.getHealth() - 10))
                .filter(pokemon -> pokemon.getHealth() > 0)
                .collect(Collectors.toList());
    }
    public void earnBadge(){
        numberOfBadges++;
    }

    public String toString() {
        return String.format("%s %d %d", name, numberOfBadges, collectionOfPokemon.size());
    }
}
