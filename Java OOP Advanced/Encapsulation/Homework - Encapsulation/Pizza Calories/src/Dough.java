import java.util.HashMap;
import java.util.Map;

public class Dough {
    private static final Map<String, Double> doughParameters = new HashMap<>() {{
        put("white", 1.5);
        put("wholegrain", 1.0);
        put("crispy", 0.9);
        put("chewy", 1.1);
        put("homemade", 1.0);
    }};
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.flourType = flourType;
        this.bakingTechnique = bakingTechnique;
        this.weight = weight;
    }

    public void setFlourType(String flourType) {
        if (!doughParameters.containsKey(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough");
        }
        this.flourType = flourType;
    }

    public void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    public void setWeight(double weight) {
        if (weight > 200 || weight < 1) {
            throw new IllegalArgumentException("Dough weight should be in the range (1..200)");
        }
        this.weight = weight;
    }

   // public  calculateCalories() {
   //
   // }
}
