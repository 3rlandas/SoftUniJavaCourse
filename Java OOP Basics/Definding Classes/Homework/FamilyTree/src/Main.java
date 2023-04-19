import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Person> data = new HashMap<>();

        List<String> inputData = new ArrayList<>();

        String characterName = null;
        String characterBirthday = null;

        String input = scanner.nextLine();

        if (input.contains(" ")) {
            characterName = input;
        } else if (input.contains("/")) {
            characterBirthday = input;
        }

        input = scanner.nextLine();

        while (!input.contains("End")) {

            if (input.contains("-")) {
                inputData.add(input);

            } else {

                String[] splitData = input.split("\s+");
                String fullName = splitData[0] + " " + splitData[1];
                if (fullName.equals(characterName)) {
                    characterBirthday = splitData[2];
                } else {
                    inputData.add(input);
                }
            }
            input = scanner.nextLine();
        }

        for (String a : inputData) {

            String resultLeftSideName = null;
            String resultLeftSideBirthday = null;
            String resultRightSideName= null;
            String resultRightSideBirthday = null;
           // String birthday = null;
            String[] result = a.split("(?<=[a-zA-Z-0-9])\\s-\\s|\\s(?=\\d)");
            if (!result[0].contains("/")) {
                resultLeftSideName = result[0];
            }else{
                resultLeftSideBirthday = result[0];
            }
            if (!result[1].contains("/")) {
                resultRightSideName = result[1];
            } else {
                resultRightSideBirthday = result[1];
            }

            if (a.contains(" - ")) {

                Person.Children children = new Person.Children(characterName, resultLeftSideName,
                        resultLeftSideBirthday, resultRightSideName, resultRightSideBirthday);





                /*if (characterName.equals(result[0])) {
                    Person.Children children = new Person.Children(birthday);
                } else if (characterBirthday.equals(result[0])) {

                    Person.Children children = new Person.Children(resultLeftSideName, birthday);

                }*/



            } else {


            }


        }
    }
}