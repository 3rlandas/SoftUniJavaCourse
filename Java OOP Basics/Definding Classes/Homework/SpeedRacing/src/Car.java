public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostsPer1km;
    private int traveledDistance;

    public Car(String model, int fuelAmount, double fuelCostPer1km, int traveledDistance) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostsPer1km = fuelCostPer1km;
        this.traveledDistance = traveledDistance;
    }

    public void calculateDistance(int amountOfKm) {

        double sum = amountOfKm * getFuelCostsPer1km();
        if (sum <= getFuelAmount()) {
            this.setFuelAmount(this.getFuelAmount() - sum);
            this.setTraveledDistance(this.getTraveledDistance() + amountOfKm);
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public int getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(int traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public double getFuelCostsPer1km() {
        return fuelCostsPer1km;
    }

    public void setFuelCostsPer1km(double fuelCostsPer1km) {
        this.fuelCostsPer1km = fuelCostsPer1km;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
