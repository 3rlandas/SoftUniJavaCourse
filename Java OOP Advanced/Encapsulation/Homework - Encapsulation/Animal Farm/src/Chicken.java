public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A chicken's name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("A chicken's age can only be a number between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {

        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("%s (%d) can lay %.2f eggs per day.", this.name, this.age, this.productPerDay());
    }

    private double calculateProductPerDay() {

        if (age < 6) {
            return 2;
        } else if (age > 5 && age < 11) {
            return 1;
        } else {
            return 0.75;
        }
    }
}

