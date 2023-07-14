import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] input = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).toArray(Integer[]::new);

        int sum = input[0];

        if(input.length >= 2){

            BiFunction<Integer, Integer, Integer> parser = (x, y) -> x + y;

            for (int i = 1; i < input.length; i++) {
                sum = parser.apply(sum, input[i]);
            }
        }
        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + sum);
    }
}
