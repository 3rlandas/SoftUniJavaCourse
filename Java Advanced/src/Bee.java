import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int beePositionRow = 0;
        int beePositionColumn = 0;
        boolean outOfTerritory = false;
        int pollinatedFlowerCount = 0;

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
        for (int row = 0; row < n; row++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int column = 0; column < matrix[row].length; column++) {

                if (input[column] == 'B') {
                    beePositionRow = row;
                    beePositionColumn = column;
                }
                matrix[row][column] = input[column];
            }
        }
        while (true) {

            String commands = scanner.nextLine();

            if (commands.equals("End")) {
                break;
            }

            matrix[beePositionRow][beePositionColumn] = '.';

            BeePositionModel model = changeBeePosition(beePositionRow, beePositionColumn, matrix, commands);

            beePositionRow = model.beePositionRow;
            beePositionColumn = model.beePositionColumn;
            outOfTerritory = model.isOutOfTerritory;

            if (outOfTerritory) {
                break;
            }
            if (matrix[beePositionRow][beePositionColumn] == 'O') {
                matrix[beePositionRow][beePositionColumn] = '.';
                model = changeBeePosition(beePositionRow, beePositionColumn, matrix, commands);
                beePositionRow = model.beePositionRow;
                beePositionColumn = model.beePositionColumn;
                outOfTerritory = model.isOutOfTerritory;
            }
            if (matrix[beePositionRow][beePositionColumn] == 'f') {
                pollinatedFlowerCount++;
            }
            matrix[beePositionRow][beePositionColumn] = 'B';

        }

        if (outOfTerritory) {
            System.out.println("The bee got lost!");
        }
        if (pollinatedFlowerCount >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!\n", pollinatedFlowerCount);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more\n", (5 - pollinatedFlowerCount));
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]);
            }
            System.out.println();
        }

    }

    public static BeePositionModel changeBeePosition(int beePositionRow, int beePositionColumn, char[][] matrix, String command) {
        boolean outOfTerritory = false;

        switch (command) {

            case "up":
                if (isInRange(beePositionRow - 1, beePositionColumn, matrix)) {
                    beePositionRow--;
                } else {
                    outOfTerritory = true;
                }
                break;

            case "down":
                if (isInRange(beePositionRow + 1, beePositionColumn, matrix)) {
                    beePositionRow++;
                } else {
                    outOfTerritory = true;
                }
                break;

            case "left":
                if (isInRange(beePositionRow, beePositionColumn - 1, matrix)) {
                    beePositionColumn--;
                } else {
                    outOfTerritory = true;
                }
                break;

            case "right":
                if (isInRange(beePositionRow, beePositionColumn + 1, matrix)) {
                    beePositionColumn++;
                } else {
                    outOfTerritory = true;
                }

                break;
        }

        BeePositionModel model = new BeePositionModel();
        model.beePositionRow = beePositionRow;
        model.beePositionColumn = beePositionColumn;
        model.isOutOfTerritory = outOfTerritory;
        return model;
    }


    public static boolean isInRange(int beePositionRow, int beePositionColumn, char[][] matrix) {
        return beePositionRow >= 0 && beePositionRow < matrix.length && beePositionColumn >= 0 && beePositionColumn < matrix[beePositionRow].length;
    }

    public static class BeePositionModel {
        int beePositionColumn = 0;
        int beePositionRow = 0;
        boolean isOutOfTerritory = false;
    }
}

