import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> peoplesInformation = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        Person person = new Person();

        for (int i = 0; i < n; i++) {


            String info[] = scanner.nextLine().split("\\s+");

            if (Integer.parseInt(info[1]) > 30) {

                peoplesInformation.put(info[0], Integer.parseInt(info[1]));
            }
        }

        for (Map.Entry<String, Integer> entry : peoplesInformation.entrySet()) {

            person.name = entry.getKey();
            person.age = entry.getValue();

            System.out.printf("%s - %d\n", person.name, person.age);
        }
    }
}


/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          Set<Person> people = new TreeSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);

            if (person.getAge() > 30) {
                people.add(person);
            }

        }

        for (Person person : people) {
            System.out.println(person);
        }
    }
}*/























