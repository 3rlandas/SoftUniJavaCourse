import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<String, String> dataBase = new TreeMap<>();

        String peopleData = scanner.nextLine();

        while (!peopleData.equals("search")) {

            if (peopleData.equals("stop")) {
                break;
            }
            String[] dataDetails = peopleData.split("-");

            if (dataBase.containsKey(dataDetails[0])) {
                dataBase.put(dataDetails[0], dataDetails[1]);
            }

            dataBase.putIfAbsent(dataDetails[0], dataDetails[1]);

            peopleData = scanner.nextLine();
        }

        LinkedHashSet<String> names = new LinkedHashSet<>();

        peopleData = scanner.nextLine();
        while (!peopleData.equals("stop")) {

            names.add(peopleData);

            peopleData = scanner.nextLine();
        }

        for (String name : names) {

            if (dataBase.containsKey(name)) {
                System.out.printf("%s -> %s\n", dataBase.ceilingKey(name), dataBase.get(name));
            } else {
                System.out.printf("Contact %s does not exist.\n", name);
            }
        }

    }
}
