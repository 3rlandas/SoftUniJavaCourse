import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split("\\s+");
        String[] truckInput = scanner.nextLine().split("\\s+");

        double carFuelQuantity = Double.parseDouble(carInput[1]);
        double carLitersPerKm = Double.parseDouble(carInput[2]);

        double truckFuelQuantity = Double.parseDouble(truckInput[1]);
        double truckLitersPerKm = Double.parseDouble(truckInput[2]);

        Car car = new Car(carFuelQuantity, carLitersPerKm);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            if(input[0].equals("Drive")){

            }

        }
    }
}