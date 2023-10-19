public class Car {
    private Double fuelQuantity;
    private Double fuelConsumption;
    private Double distanceToDrive;
    private Double refueling;


    public Car(double carFuelQuantity, double carLitersPerKm) {

        this.fuelQuantity = carFuelQuantity;
        this.fuelConsumption = carLitersPerKm * 1.09;
      //  this.distanceToDrive = ;
       // this.refueling = ;
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
