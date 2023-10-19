import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\|");

        Map<String, Map<String, Long>> countriesInformation = new LinkedHashMap<>();

        while (!input[0].equals("report")) {

            String country = input[1];
            String city = input[0];
            long population = Long.parseLong(input[2]);

            countriesInformation.putIfAbsent(country, new LinkedHashMap<>());
            countriesInformation.get(country).put(city, population);

            input = scanner.nextLine().split("\\|");
        }

        countriesInformation.entrySet().stream().sorted((e1, e2) -> Long.compare(getTotalPopulation(e2.getValue()), getTotalPopulation(e1.getValue())))
                .forEach(e -> {
                    System.out.printf("%s (total population: %d)%n", e.getKey(), getTotalPopulation(e.getValue()));
                    e.getValue().entrySet().stream().sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                            .forEach(c -> {
                                System.out.printf("=>%s: %d%n", c.getKey(), c.getValue());
                            });
                });
    }
    private static long getTotalPopulation(Map<String, Long> map) {
        long sum = 0;
        for (Map.Entry<String, Long> e : map.entrySet()) {
            sum += e.getValue();
        }
        return  sum;
    }
}
