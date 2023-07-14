import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVAT = number -> number * 1.2;

        Double[] input = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble)
                .map(addVAT).toArray(Double[]::new);

        System.out.println("Prices with VAT:");

        for (Double number : input) {
            System.out.printf("%.2f%n", number);
        }
    }
}