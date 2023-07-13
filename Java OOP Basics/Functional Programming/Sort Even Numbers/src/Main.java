import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split("[,\\s]+");
        for (String n : input) {
            numbers.add(Integer.parseInt(n));
        }

        numbers.removeIf(n -> n % 2 != 0);

        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));

        numbers.sort((a, b) -> a.compareTo(b));
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));

    }
}
