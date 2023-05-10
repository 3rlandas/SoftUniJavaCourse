public class Person {

    String name;
    int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String printNameAndAge() {

        return String.format("%s - %d", this.name, this.age);

    }
}


/*public class Person implements Comparable<Person> {

    private String name;
    private int age;


    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String toString() {

        return this.getName() + " - " + this.getAge();
    }
}*/
