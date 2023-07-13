import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedListClass list = new LinkedListClass();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            if (input[0].equals("Add")) {

                list.add(Integer.parseInt(input[1]));
            } else if (input[0].equals("Remove")) {
                list.remove(Integer.parseInt(input[1]));

            }
        }
        System.out.println(list.getSize());

        list.forEach(e -> System.out.print(e + " "));
    }
}