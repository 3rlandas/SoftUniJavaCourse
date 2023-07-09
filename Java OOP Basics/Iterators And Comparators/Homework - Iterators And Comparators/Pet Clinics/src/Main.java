import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Pets> petsList = new HashMap();
        Map<String, Clinics> clinicsList = new HashMap<>();


        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            switch (input[0]) {

                case "Create":
                    if (input[1].equals("Pet")) {

                        petsList.put(input[2], new Pets(input[2], Integer.parseInt(input[3]), input[4]));

                    } else if (input[1].equals("Clinic")) {

                        try {
                            clinicsList.putIfAbsent(input[2], new Clinics(Integer.parseInt(input[3])));

                        } catch (IllegalArgumentException roomCount) {
                            System.out.println(roomCount.getMessage());
                        }
                    }
                    break;
                case "Add":

                    System.out.println(clinicsList.get(input[2]).addPets(petsList.get(input[1])));

                    break;
                case "Release":

                    System.out.println(clinicsList.get(input[1]).releasePet());

                    break;
                case "HasEmptyRooms":
                    System.out.println(clinicsList.get(input[1]).hasEmptyRooms());

                    break;
                case "Print":
                    if (input.length == 2) {

                        clinicsList.get(input[1]).printClinic();

                    } else if (input.length == 3) {
                        clinicsList.get(input[1]).printRoom(Integer.parseInt(input[2]));
                    }
                    break;
            }
        }
    }
}