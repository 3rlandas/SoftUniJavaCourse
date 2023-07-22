import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static class SortNumbers implements Comparator<Integer> {

        @Override
        public int compare(Integer firstNum, Integer secondNum) {

            if(firstNum % 2 == 0 && secondNum % 2 != 0) return -1;
            else if(firstNum % 2 != 0 && secondNum % 2 == 0) return 1;
            return firstNum.compareTo(secondNum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Collections.sort(numbers, new SortNumbers());
        for (Integer integer : numbers) {
            System.out.print(integer+" ");
        }
    }
}
