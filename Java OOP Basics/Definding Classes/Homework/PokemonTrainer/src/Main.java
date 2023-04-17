import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Trainer> trainerInformation = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {

            String[] inputDetails = input.split("\\s+");

            String trainerName = inputDetails[0];
            String pokemonName = inputDetails[1];
            String pokemonElement = inputDetails[2];
            int pokemonHealth = Integer.parseInt(inputDetails[3]);
            int numberOfBadges = 0;
            Pokemon collectionOfPokemon = null;

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainerInformation.putIfAbsent(trainerName, trainer);
            trainerInformation.get(trainerName).getCollectionOfPokemon().add(pokemon);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {

            String element = input;

            for (Trainer t : trainerInformation.values()){

                if(t.getNumberOfElements(input) == 0){

                    t.loseHealth();
                }else{
                    t.earnBadge();
                }
            }
            input = scanner.nextLine();
        }
        trainerInformation.values().stream().sorted((e1, e2) -> Integer.compare(e2.getNumberOfBadges(), e1.getNumberOfBadges()))
                .forEach(System.out::println);
    }
}
