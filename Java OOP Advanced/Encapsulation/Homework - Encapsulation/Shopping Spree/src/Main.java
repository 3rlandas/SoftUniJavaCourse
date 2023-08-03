import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> allPeople = new LinkedHashMap<>();
        Map<String, Product> allProducts = new HashMap<>();

        String[] people = scanner.nextLine().split(";");

        for (String element : people) {
            String[] personData = element.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);

            try {
                Person person = new Person(name, money);
                allPeople.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        String[] products = scanner.nextLine().split(";");

        for (String element : products) {
            String[] productData = element.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try {
                Product product = new Product(name, cost);
                allProducts.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("END")) {

            String personName = input[0];
            String productName = input[1];

            try {

                Person person = allPeople.get(personName);
                Product product = allProducts.get(productName);

                person.buyProduct(product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            input = scanner.nextLine().split(" ");
        }

        for (Person person : allPeople.values()) {
            System.out.print(person.getName() + " - ");
            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                person.getProducts().stream().map(Product::getName).collect(Collectors.joining(", "));
            }
        }
    }
}