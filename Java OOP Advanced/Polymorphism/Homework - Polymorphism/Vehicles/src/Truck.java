public class Truck {
    private Double fuelQuantity;
    private Double fuelConsumption;
    private Double distanceToDrive;
    private Double refueling;

    public Truck(Double fuelQuantity, Double fuelConsumption, Double distanceToDrive, Double refueling) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption * 1.16;
        this.distanceToDrive = distanceToDrive;
        this.refueling = refueling * 0.95;
    }

    public Double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Double getDistanceToDrive() {
        return distanceToDrive;
    }

    public void setDistanceToDrive(Double distanceToDrive) {
        this.distanceToDrive = distanceToDrive;
    }

    public Double getRefueling() {
        return refueling;
    }

    public void setRefueling(Double refueling) {
        this.refueling = refueling;
    }
}
