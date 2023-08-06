import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teams = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split(";");

        while (!input[0].equals("END")) {
            String command = input[0];
            String teamName = input[1];

            Team currentTeam = null;
            String playerName = "";
            try {
                switch (input[0]) {

                    case "Team":
                        Team team = new Team(teamName);
                        teams.putIfAbsent(teamName, team);
                        break;

                    case "Add":
                        playerName = input[2];
                        int endurance = Integer.parseInt(input[3]);
                        int sprint = Integer.parseInt(input[4]);
                        int dribble = Integer.parseInt(input[5]);
                        int passing = Integer.parseInt(input[6]);
                        int shooting = Integer.parseInt(input[7]);
                        if (!teams.containsKey(teamName)) {

                            // String message = String.format("%s: There are no teams registered under this name.", input[1]);
                            // throw new IllegalArgumentException(message);

                            System.out.println(String.format("%s: There are no teams registered under this name.", teamName));
                        }
                        Player player = new Player(playerName, endurance,
                                sprint, dribble, passing, shooting);
                        teams.get(teamName).addPlayer(player);
                        break;

                    case "Remove":
                        playerName = input[2];

                        teams.get(teamName).removePlayer(playerName);

                        break;

                    case "Rating":
                        if (!teams.containsKey(teamName)) {

                            // String message = String.format("%s: There are no teams registered under this name.", input[1]);
                            // throw new IllegalArgumentException(message);

                            System.out.println(String.format("%s: There are no teams registered under this name.", teamName));
                        } else {
                            int result = (int) Math.round(teams.get(teamName).getRating());
                            System.out.println(String.format("%s - %d", teamName, result));
                            break;
                        }
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            input = scanner.nextLine().split(";");
        }
        System.out.println();
    }
}