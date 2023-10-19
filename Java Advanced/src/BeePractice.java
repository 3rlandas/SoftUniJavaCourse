import java.util.Scanner;

public class BeePractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean outOfBounds = false;

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
        for (int row = 0; row < n; row++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int column = 0; column < matrix[row].length; column++) {

                matrix[row][column] = input[column];
            }
        }
        BeeGameGrid game = new BeeGameGrid(matrix);

        while (true) {

            String command = scanner.nextLine();

            if (command.equals("End")) {
                break;
            }

            outOfBounds = game.MoveBee(command);

            if (outOfBounds) {
                break;
            }
        }

        if (outOfBounds) {
            System.out.println("The bee got lost!");
        }
        if (game.FlowersCollected >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!\n", game.FlowersCollected);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more\n", (5 - game.FlowersCollected));
        }
        game.PrintGrid();
    }
}
