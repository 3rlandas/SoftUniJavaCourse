import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Engine> engineMap = new LinkedHashMap<>();
        List<Car> cars = new ArrayList<>();

        int firstNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < firstNum; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");

            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);
            //optional
            int displacement = -1;
            String efficiency = "n/a";

            if (tokens.length == 3) {

                if (Character.isAlphabetic(tokens[2].charAt(0))) {
                    efficiency = tokens[2];

                } else {
                    displacement = Integer.parseInt(tokens[2]);
                }
            } else if (tokens.length == 4) {
                displacement = Integer.parseInt(tokens[2]);
                efficiency = tokens[3];
            }

            Engine engine = new Engine(model, power, displacement, efficiency);

            engineMap.put(model, engine);
        }

        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < secondNum; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");

            String model = tokens[0];
            String engineModel = tokens[1];
            Engine engine = engineMap.get(engineModel);
            //optional
            int weight = -1;
            String colour = "n/a";

            if (tokens.length == 3) {

                if (Character.isAlphabetic(tokens[2].charAt(0))) {

                    colour = tokens[2];

                } else {
                    weight = Integer.parseInt(tokens[2]);
                }
            } else if (tokens.length == 4) {
                colour = tokens[3];
                weight = Integer.parseInt(tokens[2]);
            }

            Car car = new Car(model, engine, weight, colour);
            cars.add(car);
        }

        cars.forEach(System.out::println);
    }
}