
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarmingTwo {
    public static void main(String[] args) {
        //This is only testing. Original is called legendaryFarming
        Scanner scanner = new Scanner(System.in);


        TreeMap<String, Integer> materials = new TreeMap<>();

        TreeMap<String, Integer> junkMaterials = new TreeMap<>();

        boolean legendaryObtainer = false;

        while (!legendaryObtainer) {

            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {

                String material = input[i + 1];
                int quantity = Integer.parseInt(input[i]);

                if (material.equals("Shards") || material.equals("Fragments") || material.equals("Motes")) {
                    materials.putIfAbsent(material, 0);
                    materials.put(material, materials.get(material) + quantity);
                    if (materials.get(material) >= 250) {
                        System.out.printf("%s obtainer!", getObtainer(material));
                        legendaryObtainer = true;
                    }
                } else {

                    junkMaterials.putIfAbsent(material, 0);
                    junkMaterials.put(material, junkMaterials.get(material) + quantity);
                }
            }
        }

    }

    private static Object getObtainer(String material) {
        if (material.equals("Shards")) {
            return "Shadowmourne";
        } else if (material.equals("Fragments")) {
            return "Valanyr";
        } else if (material.equals("Motes")) {
            return "Dragonwrath";
        }
        return null;
    }
}
