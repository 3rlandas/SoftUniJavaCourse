import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private String dough;
    private List<Topping> toppings;

    public Pizza(String name, String dough) {
        this.name = name;
        this.dough = dough;
        this.toppings = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setToppings(List<Topping> toppings) {
        if (toppings.isEmpty() || toppings.size() > 10 ) {
            throw new IllegalArgumentException("Number of toppings should be in range (0..10)");
        }
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public void addToppings(){

    }
    public void getOverallCalories(){

    }
}
