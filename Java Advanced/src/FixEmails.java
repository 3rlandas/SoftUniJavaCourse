import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> data = new LinkedHashMap<>();
        String name = scanner.nextLine();

        while (!name.equals("stop")) {

            String emailInput = scanner.nextLine();


            if (!emailInput.toLowerCase().contains(".uk") && !emailInput.toLowerCase().contains(".us") && !emailInput.toLowerCase().contains(".com")) {

                if (data.containsKey(name)) {
                    data.replace(name, data.get(emailInput));
                }
                data.putIfAbsent(name, emailInput);
            }
            name = scanner.nextLine();
        }

        for (Map.Entry<String, String> datum : data.entrySet()) {

            System.out.printf("%s -> %s\n", datum.getKey(), datum.getValue());
        }
    }
}
