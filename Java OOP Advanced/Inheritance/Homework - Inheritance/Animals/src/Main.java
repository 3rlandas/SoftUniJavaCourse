import Animals.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfAnimal = scanner.nextLine();

        while (!typeOfAnimal.equals("Beast!")){

            String[] animalDetails = scanner.nextLine().split("\\s+");
            String name = animalDetails[0];
            int age = Integer.parseInt(animalDetails[1]);
            String gender = animalDetails[2];

            try {
                switch (typeOfAnimal){
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog);
                        break;

                    case "Frog:":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog);
                        break;

                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat);
                        break;

                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten);
                        break;

                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            typeOfAnimal = scanner.nextLine();
        }
    }
}