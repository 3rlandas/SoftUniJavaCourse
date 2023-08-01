import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person("John", "Brook", 22);

        System.out.println(person);

        System.out.println(person.getAge());
    }
}