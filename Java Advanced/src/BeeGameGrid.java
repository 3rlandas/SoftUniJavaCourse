public class BeeGameGrid {
    private char[][] matrix;
    private int beePositionRow;
    private int beePositionColumn;
    public int FlowersCollected;
    boolean isOutOfBounds = false;
    private String direction;

    public BeeGameGrid(char[][] matrix) {
        this.matrix = matrix;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {

                if (matrix[row][column] == 'B') {
                    beePositionRow = row;
                    beePositionColumn = column;
                    return;
                }
            }
        }
    }

    public void PrintGrid() {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]);
            }
            System.out.println();
        }
    }

    public boolean MoveBee(String direction) {

        this.direction = direction;

        matrix[beePositionRow][beePositionColumn] = '.';

        switch (direction) {

            case "up":
                if (isInRange(beePositionRow - 1, beePositionColumn, matrix)) {
                    beePositionRow--;
                } else {
                    isOutOfBounds = true;
                }
                break;

            case "down":
                if (isInRange(beePositionRow + 1, beePositionColumn, matrix)) {
                    beePositionRow++;
                } else {
                    isOutOfBounds = true;
                }
                break;

            case "left":
                if (isInRange(beePositionRow, beePositionColumn - 1, matrix)) {
                    beePositionColumn--;
                } else {
                    isOutOfBounds = true;
                }
                break;

            case "right":
                if (isInRange(beePositionRow, beePositionColumn + 1, matrix)) {
                    beePositionColumn++;
                } else {
                    isOutOfBounds = true;
                }
                break;
        }
        if (!isOutOfBounds) {
            UpdateMatrix();
        }

        return isOutOfBounds;
    }

    private void UpdateMatrix() {
        if (matrix[beePositionRow][beePositionColumn] == 'O') {

            isOutOfBounds = this.MoveBee(direction);
        }
        if (matrix[beePositionRow][beePositionColumn] == 'f') {
            FlowersCollected++;
        }
        matrix[beePositionRow][beePositionColumn] = 'B';
    }

    private boolean isInRange(int beePositionRow, int beePositionColumn, char[][] matrix) {
        return beePositionRow >= 0 && beePositionRow < matrix.length && beePositionColumn >= 0 && beePositionColumn < matrix[beePositionRow].length;
    }
}
