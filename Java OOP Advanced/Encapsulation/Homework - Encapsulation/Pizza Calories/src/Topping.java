import java.util.HashMap;
import java.util.Map;

public class Topping {
    private static final Map<String, Double> toppingsParameters = new HashMap<>() {{
        put("meat", 1.2);
        put("veggies", 0.8);
        put("cheese", 1.1);
        put("sauce", 0.9);
    }};

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.toppingType = toppingType;
        this.weight = weight;
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
}
