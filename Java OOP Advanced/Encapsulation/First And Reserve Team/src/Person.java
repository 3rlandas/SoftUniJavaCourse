public class Person {
    private  String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }
    @Override
    public String toString() {
        return String.format("%s %s gets %.2f euro", firstName, lastName, salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 460){
            throw new IllegalArgumentException("A person's salary cannot be less than 460 euro");
        }
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() < 3){
            throw new IllegalArgumentException("A person's first name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() < 3){
            throw new IllegalArgumentException("A person's last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new IllegalArgumentException("A person's age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void increaseSalary(double bonus) {

        if (this.getAge() < 30){
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 200));
        }else{
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 100));
        }

       /* if(getAge() >= 30){
            salary *= 1.20;
        }else{
            salary *= 1.10;
        }*/
    }
}
