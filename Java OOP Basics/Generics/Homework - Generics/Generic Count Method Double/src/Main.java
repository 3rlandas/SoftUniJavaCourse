import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double input = Double.parseDouble(scanner.nextLine());

            list.add(input);
        }
        double stringCompareTo = Double.parseDouble(scanner.nextLine());
        System.out.println(compare(list, stringCompareTo));

    }
    public static <T extends Comparable<T>> int compare(List<T> value, T stringCompareTo) {

        int count = 0;
        for (T txt : value) {
            if (txt.compareTo(stringCompareTo) > 0) {
                count++;
            }
        }
        return count;
    }
}