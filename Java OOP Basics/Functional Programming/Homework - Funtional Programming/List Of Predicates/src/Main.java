import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer> divisibleNumber = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                for (Integer number : numbers) {
                    if(num % number != 0){
                        return false;
                    }
                }
                return true;
            }
        };

        for (int i = 1; i <= n; i++) {
            if(divisibleNumber.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}
