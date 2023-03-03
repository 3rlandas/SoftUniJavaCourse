import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> information = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String model = input[0];
            int fuelAmount = Integer.parseInt(input[1]);
            double fuelCostPer1km = Double.parseDouble(input[2]);
            int traveledDistance = 0;

            Car car = new Car(model, fuelAmount, fuelCostPer1km, traveledDistance);

            information.put(model, car);
        }

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("End")) {

            String model = command[1];
            int amountOfKm = Integer.parseInt(command[2]);

            Car car = information.get(model);
            car.calculateDistance(amountOfKm);

            command = scanner.nextLine().split("\\s+");
        }

        for (Map.Entry<String, Car> entry : information.entrySet()) {

            Car car = entry.getValue();
            System.out.printf("%s %.2f %d\n", entry.getKey(), car.getFuelAmount(), car.getTraveledDistance());
        }
    }
}