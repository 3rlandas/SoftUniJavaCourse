import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        for (int starCount = 1; starCount <= size; starCount++) {
            printRow(size, starCount);
        }
        for (int starCount = size - 1; starCount >= 1 ; starCount--) {
            printRow(size, starCount);
        }
    }

    private static void printRow(int figureSize, int starCount) {

        for (int i = 0; i < figureSize - starCount; i++) {
            System.out.print(" ");
        }
        for (int column = 1; column < starCount; column++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}