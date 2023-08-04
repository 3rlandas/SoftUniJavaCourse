import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*public class Topping {
    private static final Map<String, Double> toppingsParameters = new HashMap<>() {{
        put("Meat", 1.2);
        put("Veggies", 0.8);
        put("Cheese", 1.1);
        put("Sauce", 0.9);
    }};

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    public void setToppingType(String toppingType) {
        if (!toppingsParameters.containsKey(toppingType)) {
            String message = String.format("Cannot place %s on top of your pizza", toppingType);
            throw new IllegalArgumentException(message);
        }

        this.toppingType = toppingType;
    }

    public void setWeight(double weight) {
        if (weight > 50 || weight < 1) {
            String message = String.format("%s weight should be in the range (1..50)", this.toppingType);
            throw new IllegalArgumentException(message);
        }
        this.weight = weight;
    }
    public double calculateToppingsCalories() {

        return (2 * this.weight) * toppingsParameters.get(this.toppingType);

    }
}*/

public class Topping {
    private String toppingType;
    private double weight;

    private List<String> toppings = new ArrayList<>(List.of("Meat", "Veggies", "Cheese", "Sauce"));

    public Topping(String toppingType, double weight) {

        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) { // meat, veggies, cheese, or sauce

        if (!toppings.contains(toppingType)){

            throw new IllegalArgumentException("Cannot place "+ toppingType +" on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {

        if (weight <= 0 || weight > 50) {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories () {

        ToppingsModifiers toppingsModifiersEnum = ToppingsModifiers.valueOf(this.toppingType.toUpperCase());

        double result = toppingsModifiersEnum.getCalories() * this.weight * 2;

        return result;
    }
}