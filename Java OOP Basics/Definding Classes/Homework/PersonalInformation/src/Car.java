public class Car {
    private String carModel;
    private int carSpeed;


    public Car(String carModel, int carSpeed){
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public String getCarModel() {
        return carModel;
    }
    @Override
    public String toString() {
        return this.getCarModel() + " " + this.getCarSpeed();
    }
}
