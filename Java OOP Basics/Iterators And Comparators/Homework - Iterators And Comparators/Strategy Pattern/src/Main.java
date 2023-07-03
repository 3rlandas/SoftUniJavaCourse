import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Person> nameList = new TreeSet<>(new CompareByName());
        Set<Person> ageList = new TreeSet<>(new CompareByAge());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] information = scanner.nextLine().split("\\s+");
            String name = information[0];
            int age = Integer.parseInt(information[1]);

            nameList.add(new Person(name, age));
            ageList.add(new Person(name, age));

        }

        nameList.forEach(System.out::println);
        ageList.forEach(System.out::println);
    }
}