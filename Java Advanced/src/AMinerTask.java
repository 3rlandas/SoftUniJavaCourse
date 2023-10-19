import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String recourses = scanner.nextLine();

        LinkedHashMap<String, Integer> data = new LinkedHashMap<>();

        while (!recourses.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (data.containsKey(recourses)) {
                data.replace(recourses, data.get(recourses) + quantity);
            }
            data.putIfAbsent(recourses, quantity);

            recourses = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> datum : data.entrySet()) {

            System.out.printf("%s -> %d\n", datum.getKey(), datum.getValue());

        }
    }
}
