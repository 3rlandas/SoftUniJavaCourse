import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, TreeMap<String, Integer>> information = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String name = input[1];
            int duration = Integer.parseInt(input[2]);
            String ip = input[0];

            information.putIfAbsent(name, new TreeMap<>());

            information.get(name).putIfAbsent(ip, 0);
            information.get(name).put(ip, information.get(name).get(ip) + duration);

        }

        information.entrySet().forEach(e -> {
            List<String> ips = new ArrayList<>(e.getValue().keySet());

            int totalDuration = getTotalDuration(e.getValue());

            System.out.printf("%s: %d %s%n", e.getKey(), totalDuration, ips);
        });
    }

    private static int getTotalDuration(TreeMap<String, Integer> value) {
        return value.values().stream().mapToInt(e -> e).sum();
    }
}
