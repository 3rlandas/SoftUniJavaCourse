public class Dog extends Animal {
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    protected String getAnimalInfo() {

        return String.format("%s%nBARK", this.toString());
    }
}
