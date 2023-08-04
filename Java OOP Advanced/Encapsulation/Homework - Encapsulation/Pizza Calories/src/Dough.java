import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*public class Dough {
    private static final Map<String, Double> doughParameters = new HashMap<>() {{
        put("White", 1.5);
        put("Wholegrain", 1.0);
        put("Crispy", 0.9);
        put("Chewy", 1.1);
        put("Homemade", 1.0);
    }};
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public void setFlourType(String flourType) {
        if (!doughParameters.containsKey(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough");
        }
        this.flourType = flourType;
    }

    public void setBakingTechnique(String bakingTechnique) {
        if (!doughParameters.containsKey(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough");
        }
        this.bakingTechnique = bakingTechnique;
    }

    public void setWeight(double weight) {
        if (weight > 200 || weight < 1) {
            throw new IllegalArgumentException("Dough weight should be in the range (1..200)");
        }
        this.weight = weight;
    }

    public double calculateDoughCalories() {

        return (2 * this.weight) * doughParameters.get(this.flourType) * doughParameters.get(this.bakingTechnique);

    }
}*/

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;
    private List<String> flours = new ArrayList<>(List.of("White", "Wholegrain"));

    private List<String> backingTechniques = new ArrayList<>(List.of("Crispy", "Chewy", "Homemade"));


    public Dough(String flourType, String bakingTechnique, double weight) {

        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {

        if (!flours.contains(flourType)) { //be white or wholegrain

            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {

        if (!backingTechniques.contains(bakingTechnique)) { // crispy, chewy, or homemade

            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {

        if (weight <= 0 || weight > 200) {

            throw new IllegalArgumentException("Dough weight should be in the range");
        }
        this.weight = weight;
    }

    public double calculateCalories() {

        DoughModifiers doughFlourTypeEnum = DoughModifiers.valueOf(this.flourType.toUpperCase());

        DoughModifiers doughBakingTechniqueEnum = DoughModifiers.valueOf(this.bakingTechnique.toUpperCase());

        double result = 2 * this.weight * doughFlourTypeEnum.getCalories() * doughBakingTechniqueEnum.getCalories();

        return result;
    }
}
