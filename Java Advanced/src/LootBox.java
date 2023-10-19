import java.util.*;

public class LootBox {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstNumbers = scanner.nextLine().split("\\s");
        String[] secondNumber = scanner.nextLine().split("\\s");

        ArrayDeque<Integer> firstToolBox = new ArrayDeque<>();
        ArrayDeque<Integer> secondToolBox = new ArrayDeque<>();

        for (String number : firstNumbers) {
            firstToolBox.add(Integer.parseInt(number));
        }
        for (String number : secondNumber) {
            secondToolBox.add(Integer.parseInt(number));
        }

        List<Integer> claimedItems = new ArrayList<>();

        while (!firstToolBox.isEmpty() && !secondToolBox.isEmpty()) {

            int firstAndLastSum = firstToolBox.peekFirst() + secondToolBox.peekLast();
            if (firstAndLastSum % 2 == 0) {

                claimedItems.add(secondToolBox.getLast() + firstToolBox.getFirst());

                firstToolBox.removeFirst();
                secondToolBox.removeLast();

            } else if (firstToolBox.peekFirst() + secondToolBox.peekLast() % 2 != 0) {

                firstToolBox.add(secondToolBox.getLast());
                secondToolBox.removeLast();
            }
        }
        if (firstToolBox.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else if (secondToolBox.isEmpty()) {
            System.out.println("Second lootbox is empty");
        }

        int sum = claimedItems.stream()
                .mapToInt(a -> a)
                .sum();

        if (sum >= 100) {
            System.out.printf("Your loot was epic! Value: %d", sum);
        } else {
            System.out.printf("Your loot was poor... Value: %d", sum);
        }
    }
}
