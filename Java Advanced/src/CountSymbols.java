import java.util.*;

public class CountSymbols {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> characters = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            characters.add(ch);
        }
        TreeMap<Character, Integer> list = new TreeMap<>();

        for (char ch : characters) {

            if (!list.containsKey(ch)) {
                list.put(ch, 1);
            } else {
                list.replace(ch, list.get(ch) + 1);
            }
        }

        for (Map.Entry<Character, Integer> ch : list.entrySet()) {
            System.out.printf("%c: %d time/s\n", ch.getKey(), ch.getValue());
        }
    }

}
