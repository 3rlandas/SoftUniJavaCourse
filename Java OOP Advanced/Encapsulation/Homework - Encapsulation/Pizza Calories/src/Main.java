import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);

        String[] pizzaInput = scanner.nextLine().split(" ");
        String pizzaName = pizzaInput[1];
        int numberOfToppings = Integer.parseInt(pizzaInput[2]);

        Pizza pizza = new Pizza(pizzaName, numberOfToppings);

        String[] doughInput = scanner.nextLine().split(" ");
        String flourType = doughInput[1];
        String bakingTechnique = doughInput[2];
        double DoughWeightInGrams = Double.parseDouble(doughInput[3]);

        double doughCalories = 0;
        double toppingCalories = 0;
        try {
            Dough dough = new Dough(flourType, bakingTechnique, DoughWeightInGrams);
            doughCalories = dough.calculateDoughCalories();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        String[] toppingsInput = scanner.nextLine().split(" ");

        while (!toppingsInput[0].equals("END")) {

            String toppingType = toppingsInput[1];
            double toppingWeightInGrams = Double.parseDouble(toppingsInput[2]);

            try {
                Topping topping = new Topping(toppingType, toppingWeightInGrams);
                toppingCalories += topping.calculateToppingsCalories();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            toppingsInput = scanner.nextLine().split(" ");
        }
        double sum = doughCalories + toppingCalories;
        System.out.printf("%s - %.2f", pizzaName, sum);*/

        Scanner scanner = new Scanner(System.in);

        List<String> commands = new ArrayList<>();

        String pizzaInput = scanner.nextLine();

        while (!pizzaInput.equals("END")) {

            commands.add(pizzaInput);
            pizzaInput = scanner.nextLine();
        }

        String[] pizzaTokens = commands.get(0).split(" ");
        String pizzaName = pizzaTokens[1];
        int pizzaNumberOfToppings = Integer.parseInt(pizzaTokens[2]);

        String[] doughTokens = commands.get(1).split(" ");
        String doughFlourType = doughTokens[1];
        String doughBackingTechnique = doughTokens[2];
        int doughWeight = Integer.parseInt(doughTokens[3]);

        try {
            Pizza pizza = new Pizza(pizzaName, pizzaNumberOfToppings);
            Dough dough = new Dough(doughFlourType, doughBackingTechnique, doughWeight);

            pizza.setDough(dough);

            for (int i = 2; i < pizzaNumberOfToppings + 2; i++) {
                String[] toppingsTokens = commands.get(i).split(" ");
                String toppingsType = toppingsTokens[1];
                int toppingsWeight =Integer.parseInt(toppingsTokens[2]);

                Topping topping = new Topping(toppingsType, toppingsWeight);

                pizza.addTopping(topping);
            }

            double overallCalories = pizza.getOverallCalories();

            System.out.printf("%s - %.2f", pizza.getName(), overallCalories);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

    }
}