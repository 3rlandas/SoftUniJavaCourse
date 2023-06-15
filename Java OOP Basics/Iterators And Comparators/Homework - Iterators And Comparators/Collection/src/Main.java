import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> data = new ArrayList<>(List.of(scanner.nextLine().split(" ")));

        data.remove(0);

        ListyIterator listyIterator = new ListyIterator(data);

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            switch (command) {

                case "Move":
                    System.out.println(listyIterator.move());
                    break;

                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;

                case "Print":
                    listyIterator.print();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
