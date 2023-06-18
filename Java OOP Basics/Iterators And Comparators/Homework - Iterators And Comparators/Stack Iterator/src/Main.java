import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stack stack = new Stack();

        String[] input = scanner.nextLine().replaceAll(",", "").split("\\s+");

        String action = input[0];

        while (!input[0].equals("END")) {

            switch (input[0]) {
                case "Push":
                    for (int i = 1; i < input.length; i++) {
                        stack.push(Integer.parseInt(input[i]));
                    }
                    break;
                case "Pop":
                    stack.pop();
                    break;
            }

            input = scanner.nextLine().replaceAll(",", "").split("\\s+");
        }

        stack.foreachCustom();
        stack.foreachCustom();
    }
}