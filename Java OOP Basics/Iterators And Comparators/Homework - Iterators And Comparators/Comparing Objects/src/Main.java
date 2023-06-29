import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> data = new ArrayList<>();

        String input;

        while (!("END").equals(input = scanner.nextLine())) {

            String[] list = input.split("\\s+");
            String name = list[0];
            int age = Integer.parseInt(list[1]);
            String town = list[2];

            Person person = new Person(name, age, town);
            data.add(person);
        }

        int n = Integer.parseInt(scanner.nextLine());

        Person selectedPerson = data.get(n - 1);

        long count = data.stream().filter(p -> selectedPerson.compareTo(p) == 0).count();

        if(count == 1){

            System.out.println("No matches");
        }else{
            System.out.printf("%d %d %d", count, data.size() - count, data.size());
        }
    }
}