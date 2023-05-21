import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");

        String name = String.format("%s %s", firstInput[0], firstInput[1]);
        String city = firstInput[2];

        Tuple<String, String> firstMap = new Tuple<>(name, city);
        System.out.println(firstMap);

        String[] secondInput = scanner.nextLine().split(" ");

         name = secondInput[0];
        int numberOfHobbies = Integer.parseInt(secondInput[1]);

        Tuple<String, Integer> secondMap = new Tuple<>(name, numberOfHobbies);
        System.out.println(secondMap);

        String[] thirdInput = scanner.nextLine().split(" ");

        int number = Integer.parseInt(thirdInput[0]);
        Double doubleNumber = Double.parseDouble(thirdInput[1]);

        Tuple<Integer, Double> thirdMap = new Tuple<>(number, doubleNumber);
        System.out.println(thirdMap);
    }
}