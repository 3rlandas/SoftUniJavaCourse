import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> legendaryResources = new TreeMap<>();
        legendaryResources.put("shards", 0);
        legendaryResources.put("fragments", 0);
        legendaryResources.put("motes", 0);

        boolean legendaryObtained = false;

        TreeMap<String, Integer> junkResources = new TreeMap<>();

        while (!legendaryObtained) {
            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {

                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                switch (material) {
                    case "shards":
                    case "fragments":
                    case "motes":
                        legendaryResources.putIfAbsent(material, 0);
                        legendaryResources.put(material, legendaryResources.get(material) + quantity);
                        if (legendaryResources.get(material) >= 250) {
                            System.out.printf("%s obtained!%n", getObtainedItem(material));
                            legendaryResources.put(material, legendaryResources.get(material) - 250);
                            legendaryObtained = true;
                        }
                        break;

                    default:
                        junkResources.putIfAbsent(material, 0);
                        junkResources.put(material, junkResources.get(material) + quantity);
                        break;
                }
                if (legendaryObtained) {
                    break;
                }
            }
        }

        legendaryResources.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> {
                    System.out.printf("%s: %d%n", e.getKey(), e.getValue());
                });
        junkResources.entrySet().forEach(e -> {
            System.out.printf("%s: %d%n", e.getKey(), e.getValue());
        });
    }

    private static Object getObtainedItem(String material) {
        switch (material) {
            case "shards":
                return "Shadowmourne";
            case "fragments":
                return "Valanyr";
            case "motes":
                return "Dragonwrath";
        }
        return null;
    }
}
