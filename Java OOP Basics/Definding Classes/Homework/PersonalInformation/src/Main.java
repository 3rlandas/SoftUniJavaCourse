import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+");

        while (!input[0].equals("End")) {

            Person person;
            String name = input[0];
            String information = input[1];

            if (people.containsKey(name)) {
                person = people.get(name);
            } else {
                person = new Person(name);
            }

            switch (information) {
                case "company":

                    String companyName = input[2];
                    String department = input[3];
                    double salary = Double.parseDouble(input[4]);

                    person.setCompany(new Company(companyName, department, salary));
                    break;
                case "pokemon":

                    String pokemonName = input[2];
                    String pokemonType = input[3];

                    person.getPokemon().add(new Pokemon(pokemonName, pokemonType));

                    break;
                case "parents":

                    String parentName = input[2];
                    String parentBirthday = input[3];

                    person.getParents().add(new Parents(parentName, parentBirthday));

                    break;
                case "children":

                    String childrenName = input[2];
                    String childrenBirthday = input[3];

                    person.getChildren().add(new Children(childrenName, childrenBirthday));

                    break;
                case "car":

                    String carModel = input[2];
                    int carSpeed = Integer.parseInt(input[3]);

                    person.setCar(new Car(carModel, carSpeed));
                    break;
            }

            people.put(name, person);

            input = scanner.nextLine().split("\\s+");
        }

        String selectedName = scanner.nextLine();

        Person p = people.get(selectedName);

        System.out.println(p.getName());
        System.out.println("Company:");
        if(p.getCompany() != null){
            System.out.println(p.getCompany());
        }
        System.out.println("Car:");
        if(p.getCar() != null){
            System.out.println(p.getCar());
        }
        System.out.println("Pokemon:");
        if(!p.getPokemon().isEmpty()){
            p.getPokemon().forEach(System.out::println);
        }
        System.out.println("Parents:");
        if(!p.getParents().isEmpty()){
            p.getParents().forEach(System.out::println);
        }
        System.out.println("Children:");
        if(!p.getChildren().isEmpty()){
            p.getChildren().forEach(System.out::println);
        }
    }
}
