public class Car {
    private String model;
    private Engine engine;
    //optional
    private int weight;
    private String colour;

    Car(String model, Engine engine, int weight, String colour) {

        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.colour = colour;

    }

  //  @Override
    public String toString() {
        return String.format("%s:%n%s%nWeight: %s%nColor: %s", model, engine.toString(), weight == -1 ? "n/a" : weight, colour);
    }
}
