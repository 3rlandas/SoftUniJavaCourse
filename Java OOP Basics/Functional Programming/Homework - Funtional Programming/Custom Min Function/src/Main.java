import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::valueOf).collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallestNumber = number -> {
            int min = Integer.MAX_VALUE;
            for (Integer integer : number) {
                if (integer < min) {
                    min = integer;
                }
            }
            return min;
        };
        int min = findSmallestNumber.apply(numbers);
        System.out.println(min);
    }
}