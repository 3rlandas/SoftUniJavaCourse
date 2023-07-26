import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOfPeople = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");


        while (!command[0].equals("Party!")) {

            Commands commands = new Commands(listOfPeople, command[2]);

            if (command[0].equals("Double")) {
                switch (command[1]) {

                    case "StartWith":
                        commands.StartsWith(command[2], command[0]);
                        break;

                    case "EndsWith":
                        commands.EndsWith(command[2], command[0]);
                        break;

                    case "Length":
                        commands.Length(Integer.parseInt(command[2]), command[0]);
                        break;
                }
            } else if (command[0].equals("Remove")) {
                switch (command[1]) {

                    case "StartWith":
                        commands.StartsWith(command[2], command[0]);
                        break;

                    case "EndsWith":
                        commands.EndsWith(command[2], command[0]);
                        break;

                    case "Length":
                        commands.Length(Integer.parseInt(command[2]), command[0]);
                        break;
                }
            }
            command = scanner.nextLine().split("\\s+");
        }

        if (listOfPeople.size() > 0) {

            Collections.sort(listOfPeople);

            String formattedString = listOfPeople.stream().limit(listOfPeople.size()).collect(Collectors.joining(", "));

            System.out.println(formattedString + " are going to the party!");
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }
}