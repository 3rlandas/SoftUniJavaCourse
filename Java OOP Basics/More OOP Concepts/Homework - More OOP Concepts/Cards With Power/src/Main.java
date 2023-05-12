import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String card = scanner.nextLine();
        String suit = scanner.nextLine();

        Cards cardValue = Cards.valueOf(card);
        Cards suitValue = Cards.valueOf(suit);

        int sum = cardValue.getValue() + suitValue.getValue();

        System.out.printf("Card name: %s of %s; Card power: %d", cardValue, suitValue, sum);

    }
}