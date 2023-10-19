import java.util.Scanner;

public class ReVolt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        int numOfMoves = Integer.parseInt(scanner.nextLine());

        int playerRow = 0;
        int playerColumn = 0;

        int finnishRow = 0;
        int finishColumn = 0;

        int bonusRow = 0;
        int bonusColumn = 0;

        int trapRow = 0;
        int trapColumn = 0;

        char[][] matrix = new char[matrixSize][matrixSize];

        for (int row = 0; row < matrix.length; row++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int column = 0; column < matrix[row].length; column++) {
                if (input[column] == 'f') {
                    playerRow = row;
                    playerColumn = column;
                } else if (input[column] == 'F') {
                    finnishRow = row;
                    finishColumn = column;
                } else if (input[column] == 'B') {
                    bonusRow = row;
                    bonusColumn = column;
                } else if (input[column] == 'T') {
                    trapRow = row;
                    trapColumn = column;
                }
                matrix[row][column] = input[column];
            }
        }

        for (int i = 0; i < numOfMoves; i++) {
            String commands = scanner.nextLine();

            matrix[playerRow][playerColumn] = '+';
            switch (commands) {

                case "up":

                    if (!isInRange(playerRow - 1, playerColumn, matrix)) {
                        playerRow = matrixSize - 1;
                    } else {
                        playerRow--;
                    }
                    if (stepOnBonus(playerRow, playerColumn, matrix)) {
                        if (!isInRange(playerRow - 1, playerColumn, matrix)) {
                            playerRow = matrixSize - 1;
                        } else {
                            playerRow--;
                        }
                    }
                    if (stepOnTrap(playerRow, playerColumn, matrix)) {
                        if (!isInRange(playerRow + 1, playerColumn, matrix)) {
                            playerRow = 0;
                        } else {
                            playerRow++;
                        }
                    }
                    matrix[playerRow][playerColumn] = 'f';

                    if (isOnFinish(playerRow, playerColumn, finnishRow, finishColumn)) {
                        System.out.println("Player won!");
                        printMatrix(matrix);
                        return;
                    }
                    break;
                case "down":

                    if (!isInRange(playerRow + 1, playerColumn, matrix)) {
                        playerRow = 0;
                    } else {
                        playerRow++;
                    }
                    if (stepOnBonus(playerRow, playerColumn, matrix)) {
                        if (!isInRange(playerRow + 1, playerColumn, matrix)) {
                            playerRow = 0;
                        } else {
                            playerRow++;
                        }
                    }
                    if (stepOnTrap(playerRow, playerColumn, matrix)) {
                        if (!isInRange(playerRow - 1, playerColumn, matrix)) {
                            playerRow = matrixSize - 1;
                        } else {
                            playerRow--;
                        }
                    }
                    matrix[playerRow][playerColumn] = 'f';

                    if (isOnFinish(playerRow, playerColumn, finnishRow, finishColumn)) {
                        System.out.println("Player won!");
                        printMatrix(matrix);
                        return;
                    }

                    break;
                case "left":

                    if (!isInRange(playerRow, playerColumn - 1, matrix)) {
                        playerColumn = matrix[playerRow].length - 1;
                    } else {
                        playerColumn--;
                    }
                    if (stepOnBonus(playerRow, playerColumn, matrix)) {
                        if (!isInRange(playerRow, playerColumn - 1, matrix)) {
                            playerColumn = matrixSize - 1;
                        } else {
                            playerColumn--;
                        }
                    }
                    if (stepOnTrap(playerRow, playerColumn, matrix)) {
                        if (!isInRange(playerRow, playerColumn + 1, matrix)) {
                            playerColumn = 0;
                        } else {
                            playerColumn++;
                        }
                    }
                    matrix[playerRow][playerColumn] = 'f';

                    if (isOnFinish(playerRow, playerColumn, finnishRow, finishColumn)) {
                        System.out.println("Player won!");
                        printMatrix(matrix);
                        return;
                    }
                    break;
                case "right":

                    if (!isInRange(playerRow, playerColumn + 1, matrix)) {
                        playerColumn = 0;
                    } else {
                        playerColumn++;
                    }
                    if (stepOnBonus(playerRow, playerColumn, matrix)) {
                        if (!isInRange(playerRow, playerColumn + 1, matrix)) {
                            playerColumn = 0;
                        } else {
                            playerColumn++;
                        }
                    }
                    if (stepOnTrap(playerRow, playerColumn, matrix)) {
                        if (!isInRange(playerRow, playerColumn - 1, matrix)) {
                            playerColumn = matrixSize - 1;
                        } else {
                            playerColumn--;
                        }
                    }
                    matrix[playerRow][playerColumn] = 'f';

                    if (isOnFinish(playerRow, playerColumn, finnishRow, finishColumn)) {
                        System.out.println("Player won!");
                        printMatrix(matrix);
                        return;
                    }
                    break;
            }
        }
        System.out.println("Player lost!");
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]);
            }
            System.out.println();
        }
    }

    private static boolean isOnFinish(int playerRow, int playerColumn, int finnishRow, int finishColumn) {
        return (playerRow == finnishRow) && (playerColumn == finishColumn);
    }

    private static boolean stepOnTrap(int playerRow, int playerColumn, char[][] matrix) {
        return matrix[playerRow][playerColumn] == 'T';
    }

    private static boolean stepOnBonus(int playerRow, int playerColumn, char[][] matrix) {
        return matrix[playerRow][playerColumn] == 'B';
    }

    private static boolean isInRange(int playerRow, int playerColumn, char[][] matrix) {
        return playerRow >= 0 && playerRow < matrix.length && playerColumn >= 0 && playerColumn < matrix[playerRow].length;
    }
}
