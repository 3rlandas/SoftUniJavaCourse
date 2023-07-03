import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Person> infoOne = new TreeSet<>(new ComparatorForTreeSet());
        Set<Person> infoTwo = new HashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] information = scanner.nextLine().split("\\s+");
            String name = information[0];
            int age = Integer.parseInt(information[1]);

            infoOne.add(new Person(name, age));
            infoTwo.add(new Person(name, age));
        }

        System.out.printf("%d%n%d", infoOne.size(), infoTwo.size());
    }
}