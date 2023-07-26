import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOfPeople = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Map<String, BiPredicate<String, String>> functions = new LinkedHashMap<>();

        BiPredicate<String, String> startsWithGivenIndex = (string, prefix) -> string.startsWith(prefix);
        BiPredicate<String, String> endsWithGivenIndex = (string, prefix) -> string.endsWith(prefix);
        BiPredicate<String, String> hasLength = (string, prefix) -> string.length() == Integer.parseInt(prefix);

        functions.put("StartsWith", startsWithGivenIndex);
        functions.put("EndsWith", endsWithGivenIndex);
        functions.put("Length", hasLength);

        String[] tokens = scanner.nextLine().split("\\s+");

        while (!tokens[0].equals("Party!")) {

            String command = tokens[1];
            String criteria = tokens[2];

            switch (tokens[0]) {

                case "Remove":
                    for (int i = 0; i < listOfPeople.size(); i++) {
                        if (functions.get(command).test(listOfPeople.get(i), criteria)) {
                            listOfPeople.remove(listOfPeople.get(i));
                        }
                    }
                    break;

                case "Double":
                    int size = listOfPeople.size();
                    for (int i = 0; i < size; i++) {
                        if (functions.get(command).test(listOfPeople.get(i), criteria)) {
                            listOfPeople.add(listOfPeople.get(i));
                        }
                    }
                    break;
            }
            tokens = scanner.nextLine().split("\\s+");
        }
        if (listOfPeople.isEmpty()) {

            System.out.println("Nobody is going to the party!");
            return;

        } else {
            Collections.sort(listOfPeople);

            String formattedString = listOfPeople.stream().limit(listOfPeople.size()).collect(Collectors.joining(", "));

            System.out.println(formattedString + " are going to the party!");
        }
    }
}
