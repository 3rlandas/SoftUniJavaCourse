import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerWreaths {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lilies = new ArrayList<>(List.of(scanner.nextLine().split(", ")));

        ArrayList<String> roses = new ArrayList<>(List.of(scanner.nextLine().split(", ")));

        int neededNumber = 0;
        int wreathsCount = 0;
        int totalNumber = 0;
        int createdWreaths = 0;

        for (int i = lilies.size() - 1; i >= 0; i--) {
            for (int j = 0; j <= roses.size() - 1; j++) {

                neededNumber = Integer.parseInt(lilies.get(i)) + Integer.parseInt(roses.get(j));

                if (neededNumber < 15) {
                    totalNumber += neededNumber;
                } else if (neededNumber > 15) {

                    if (neededNumber - 2 < 15) {
                        totalNumber += neededNumber;
                    } else {
                        wreathsCount += 1;
                    }
                } else {
                    wreathsCount += 1;
                }
                lilies.remove(i);
                roses.remove(j);
                i = lilies.size() - 1;
                j = -1;
            }
        }
        wreathsCount += Math.abs(totalNumber / 15);
        if (wreathsCount >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreathsCount);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", (5 - wreathsCount));
        }
    }
}
