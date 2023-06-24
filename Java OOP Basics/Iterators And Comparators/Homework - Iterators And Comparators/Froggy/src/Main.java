import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Lake lake = new Lake();

        String[] input = scanner.nextLine().replaceAll(",", "").split("\\s+");

        String secondInput = scanner.nextLine();

        for (String x : input) {
            lake.push(Integer.parseInt(x));
        }

        Lake.Jump();
    }
}