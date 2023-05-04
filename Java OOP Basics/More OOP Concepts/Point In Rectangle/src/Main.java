import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int bottomLeftX = Integer.parseInt(input[0]);
        int bottomLeftY = Integer.parseInt(input[1]);
        int topRightX = Integer.parseInt(input[2]);
        int topRightY = Integer.parseInt(input[3]);

        Rectangle rectangle = new Rectangle(bottomLeftX, bottomLeftY, topRightX, topRightY);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {

            String[] coordinates = scanner.nextLine().split("\\s+");
            int X = Integer.parseInt(coordinates[0]);
            int Y = Integer.parseInt(coordinates[1]);

            Point point = new Point(X, Y);

            System.out.println(rectangle.contains(point));
        }
    }
}
