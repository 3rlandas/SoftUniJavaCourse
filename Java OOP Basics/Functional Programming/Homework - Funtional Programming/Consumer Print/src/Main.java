import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printList = name -> System.out.println(name);


        String[] input = scanner.nextLine().split("\\s+");

        for (String name : input) {
            printList.accept(name);
        }
    }
}