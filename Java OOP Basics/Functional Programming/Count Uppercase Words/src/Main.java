import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> haveUpperCase = string -> Character.isUpperCase(string.charAt(0));

        String[] folder = Arrays.stream(scanner.nextLine().split("\\s+")).filter(haveUpperCase).toArray(String[]::new);

        System.out.println(folder.length);

        Consumer<String> output = System.out::println;
        Arrays.stream(folder).forEach(output);
    }
}
