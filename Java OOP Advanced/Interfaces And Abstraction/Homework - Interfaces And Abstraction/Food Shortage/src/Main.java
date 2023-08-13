import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Citizen> citizens = new LinkedHashMap<>();
        Map<String, Rebel> rebels = new LinkedHashMap<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            int age = Integer.parseInt(input[1]);

            if (input.length == 4) {
                String id = input[2];
                String birthdate = input[3];
                Citizen citizen = new Citizen(name, age, id, birthdate);
                citizens.putIfAbsent(name, citizen);
            } else {
                String group = input[2];
                Rebel rebel = new Rebel(name, age, group);
                rebels.putIfAbsent(name, rebel);
            }
        }

        int sum = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")){

            if(citizens.containsKey(input)){

                citizens.get(input).buyFood();
              sum += 10;
            } else if (rebels.containsKey(input)) {
                rebels.get(input).buyFood();
               sum += 5;
            }
            input = scanner.nextLine();
        }
        System.out.println(sum);
    }
}