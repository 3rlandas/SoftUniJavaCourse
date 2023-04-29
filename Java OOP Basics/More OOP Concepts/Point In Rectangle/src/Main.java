import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
       // int[] coordinates = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int bottomLeftX = Integer.parseInt(input[0]);
        int bottomLeftY = Integer.parseInt(input[1]);
        int topRightX = Integer.parseInt(input[2]);
        int topRightY = Integer.parseInt(input[3]);

        Rectangle rectangle = new Rectangle(bottomLeftX, bottomLeftY, topRightX, topRightY);

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {

            String[] coordinates = scanner.nextLine().split("\\s+");
            int X = Integer.parseInt(coordinates[0]);
            int Y = Integer.parseInt(coordinates[1]);

            Point point = new Point(X, Y);

        }




    }
}