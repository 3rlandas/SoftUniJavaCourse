import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());

            list.add(input);
        }
        String[] swapNumbers = scanner.nextLine().split("\\s+");
        int numOne = Integer.parseInt(swapNumbers[0]);
        int numTwo = Integer.parseInt(swapNumbers[1]);
        Collections.swap(list, numOne, numTwo);

        for (int text : list) {
            Box box = new Box(text);
            System.out.println(box);

        }
    }
}