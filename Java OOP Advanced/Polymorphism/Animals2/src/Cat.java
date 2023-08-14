public class Cat extends Animal {
    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    String getAnimalInfo() {
        return String.format("%s%nMEOW", this.toString());
    }
}
