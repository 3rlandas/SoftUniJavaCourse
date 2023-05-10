public class Engine {
    private String model;
    private int power;
    //optional
    private int displacement;
    private String efficiency;

    Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;

    }

    //@Override
    public String toString() {
        return String.format("%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s", model, power, displacement == -1 ? "n/a" : displacement, efficiency);
    }
}
