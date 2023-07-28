import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> invitations = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> invitationsList = new ArrayList<>(invitations);
        List<String> list = new ArrayList<>();
        if (invitations.size() == 0 ) {
            return ;
        }

        BiPredicate<String, String> startsWith = (x, y) -> x.startsWith(y);
        BiPredicate<String, String> endsWith = (x, y) -> x.endsWith(y);
        BiPredicate<String, String> length = (x, y) -> x.length() == y.length();
        BiPredicate<String, String> contains = (x, y) -> x.contains(y);

        String[] input = scanner.nextLine().split(";");

        while (!input[0].equals("Print")) {

            String command = input[0];
            String filterType = input[1];
            String filterParameter = input[2];

            if (command.equals("Add filter")) {
                for (int i = 0; i < invitations.size(); i++) {

                    String n = invitations.get(i);

                    switch (filterType) {
                        case "Starts with":
                            if (startsWith.test(n, filterParameter)) {
                                list.add(n);
                                invitationsList.remove(n);
                            }
                            break;
                        case " Ends with":
                            if (endsWith.test(n, filterParameter)) {
                                list.add(n);
                                invitationsList.remove(n);
                            }
                            break;

                        case "Length":
                            if (length.test(n, filterParameter)) {
                                list.add(n);
                                invitationsList.remove(n);
                            }

                            break;

                        case "Contains":
                            if (contains.test(n, filterParameter)) {
                                list.add(n);
                                invitationsList.remove(n);
                            }
                            break;
                    }
                }
                invitations.removeAll(list);
            } else if (command.equals("Remove filter")) {
                for (int i = 0; i < list.size(); i++) {
                    String n = list.get(i);
                    switch (filterType) {
                        case "Starts with":
                            if (startsWith.test(n, filterParameter)) {
                                invitations.add(n);
                            }
                            break;
                        case " Ends with":
                            if (endsWith.test(n, filterParameter)) {
                                invitations.add(n);
                            }
                            break;

                        case "Length":
                            if (length.test(n, filterParameter)) {
                                invitations.add(n);
                            }

                            break;

                        case "Contains":
                            if (contains.test(n, filterParameter)) {
                                invitations.add(n);
                            }
                            break;
                    }
                }
            }
            input = scanner.nextLine().split(";");
        }
        Collections.sort(invitations, Comparator.comparing(String::length).reversed());
        invitations.forEach(item -> System.out.print(item + " "));
    }
}*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() == 0) {
            return;
        }
        List<String> names = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
        String line = scanner.nextLine();
        List<String> commandLines = new ArrayList<>();

        while (!line.equals("Print")) {
            String[] lineParts = line.split(";");
            String commands = lineParts[0];
            String type = lineParts[1];
            String toCheck = lineParts[2];

            if (commands.equals("Add filter")) {
                commandLines.add(line);
            } else if (commands.equals("Remove filter")) {
                String commandToRemove = "Add filter;" + type + ";" + toCheck;
                commandLines.removeIf(s -> s.equals(commandToRemove));
            }
            line = scanner.nextLine();
        }
        for (String command : commandLines) {
            String[] lineParts = command.split(";");
            String type = lineParts[1];
            String toCheck = lineParts[2];

            Predicate<String> startsWith = name -> name.startsWith(toCheck);
            Predicate<String> endsWith = name -> name.endsWith(toCheck);
            Predicate<String> validLength = name -> name.length() == Integer.parseInt(toCheck);
            Predicate<String> containsLetter = name -> name.contains(toCheck);
            switch (type) {
                case "Starts with":
                    names.removeIf(startsWith);
                    break;
                case "Ends with":
                    names.removeIf(endsWith);
                    break;
                case "Length":
                    names.removeIf(validLength);
                    break;
                case "Contains":
                    names.removeIf(containsLetter);
                    break;
            }
        } System.out.println(names.stream().collect(Collectors.joining(" ")).toString().replaceAll("([\\[\\]])", ""));
    }
}


