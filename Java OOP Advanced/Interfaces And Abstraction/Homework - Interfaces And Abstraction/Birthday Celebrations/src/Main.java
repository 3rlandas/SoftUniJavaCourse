import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Birthable> birthDates = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

           String[] input = reader.readLine().split("\\s+");

           while (!input[0].equals("End")) {

               String name;
               String id;
               String birthDate;

               switch (input[0]) {
                   case "Citizen":
                       name = input[1];
                       int age = Integer.parseInt(input[2]);
                       id = input[3];
                       birthDate = input[4];

                       birthDates.add(new Citizen(name, age, id, birthDate));
                       break;

                   case "Pet":

                       name = input[1];
                       birthDate = input[2];
                       birthDates.add(new Pets(name, birthDate));

                       break;
               }


               input = reader.readLine().split("\\s+");
           }
           String specificYear = reader.readLine();

           birthDates.stream().filter(birthable -> birthable.getBirthDate().endsWith(specificYear)).forEach(birthable -> System.out.println(birthable.getBirthDate()));
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}