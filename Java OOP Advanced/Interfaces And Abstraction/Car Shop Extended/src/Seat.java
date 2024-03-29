public class Seat extends CarImpl implements Sellable {

    private double price;
    public Seat(String model, String color, Integer horsePower, String countryProduced, double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s%nThe price of this car %s is %.2f.", super.toString(), getModel(), price);
    }
}
