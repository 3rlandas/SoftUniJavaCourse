import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");

        String name = String.format("%s %s", firstInput[0], firstInput[1]);
        String city = firstInput[2];
        String country = firstInput[3];

        Threeuple<String, String, String> firstMap = new Threeuple<>(name, city, country);
        System.out.println(firstMap);

        String[] secondInput = scanner.nextLine().split(" ");

        boolean mood;
        name = secondInput[0];
        int numberOfHobbies = Integer.parseInt(secondInput[1]);
        if(secondInput[2].equals("happy")){
             mood = true;
        }else {
            mood = false;
        }

        Threeuple<String, Integer, Boolean> secondMap = new Threeuple<>(name, numberOfHobbies, mood);
        System.out.println(secondMap);

        String[] thirdInput = scanner.nextLine().split(" ");

        name = thirdInput[0];
        Double accountBalance = Double.parseDouble(thirdInput[1]);
        String bankName = thirdInput[2];

        Threeuple<String, Double, String> thirdMap = new Threeuple<>(name, accountBalance, bankName);
        System.out.println(thirdMap);
    }
}