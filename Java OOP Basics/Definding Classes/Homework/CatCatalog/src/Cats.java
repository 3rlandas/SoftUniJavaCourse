public class Cats {

    private String breed;
    private String name;
    private double specialCharacteristics;

    public Cats(String breed, String name, Double specialCharacteristics) {

        this.breed = breed;
        this.name = name;
        this.specialCharacteristics = specialCharacteristics;

    }

    public double getSpecialCharacteristics() {
        return specialCharacteristics;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
