import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2]);
        DiscountType discountType;

        if ("SecondVisit".equals(input[3])) {
            discountType = DiscountType.SecondVisit;
        } else {
            discountType = DiscountType.valueOf(input[3]);
        }

        System.out.printf("%.2f", PriceCalculator.calculatePrice(pricePerDay, numberOfDays, season, discountType));

    }
}