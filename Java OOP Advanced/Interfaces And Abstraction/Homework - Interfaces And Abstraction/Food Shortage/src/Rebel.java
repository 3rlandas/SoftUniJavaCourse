public class Rebel implements Buyer, Person {
    private static final int INCREASE_FOOD_WITH_FIVE = 5;

    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGroup() {
        return this.group;
    }

    @Override
    public void buyFood() {

        this.food += INCREASE_FOOD_WITH_FIVE;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
