import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Box box = new Box(input);
            System.out.println(box);
        }
    }
}