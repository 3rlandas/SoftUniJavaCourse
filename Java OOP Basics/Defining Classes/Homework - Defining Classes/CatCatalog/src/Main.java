import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Cats> catsInformation = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] data = input.split("\\s+");

            String breed = data[0];
            String name = data[1];
            Double specialCharacteristics = Double.parseDouble(data[2]);

            Cats cats = new Cats(breed, name, specialCharacteristics);

            catsInformation.put(name, cats);

            input = scanner.nextLine();
        }

        String catsName = scanner.nextLine();

        System.out.printf("%s %s %.2f", catsInformation.get(catsName).getBreed(),
                catsInformation.get(catsName).getName(), catsInformation.get(catsName).getSpecialCharacteristics());
    }
}
