import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = new ArrayList<>();

        String[] inputsArray = scanner.nextLine().split("\\s+");

        while (!inputsArray[0].equals("END")) {

            switch (inputsArray[0]) {

                case "Add":
                    inputList.add(inputsArray[1]);
                    break;

                case "Remove":
                    Remove(Integer.parseInt(inputsArray[1]), inputList);
                    break;

                case "Contains":
                    System.out.println(Contains(inputsArray[1], inputList));
                    break;

                case "Swap":
                    int num1 = Integer.parseInt(inputsArray[1]);
                    int num2 = Integer.parseInt(inputsArray[2]);

                    Swap(num1, num2, inputList);
                    break;

                case "Greater":

                    System.out.println(Greater(inputsArray[1], inputList));
                    break;

                case "Max":
                    System.out.println(Max(inputList));
                    break;

                case "Min":
                    System.out.println(Min(inputList));
                    break;

                case "Print":
                    Print(inputList);
                    break;
                case "Sort":
                    Sort(inputList);
                    break;
            }
            inputsArray = scanner.nextLine().split("\\s+");
        }
    }

    private static <T> void Sort(List<String> inputList) {
        Collections.sort(inputList);

    }

    private static <T extends Comparable> int Greater(T element, List<T> inputList) {

        T compare = element;
        int numb = 0;
        for (T txt : inputList) {
            if (compare.compareTo((String) txt) < 0) {
                numb++;
            }
        }
        return numb;

    }

    private static <T> void Print(List<T> inputList) {

        for (T txt : inputList) {

            System.out.println(txt);
        }
    }

    private static <T extends Comparable<T>> String Min(List<T> inputList) {
        String compare = (String) inputList.get(0);
        int numb = 0;
        for (T txt : inputList) {
            if (txt.compareTo((T) compare) > 0) {
                numb++;
            }
        }
        return compare;
    }

    private static <T extends Comparable<T>> String Max(List<T> inputList) {
        String compare = "";

        for (T txt : inputList) {
            if (compare.compareTo((String) txt) < 0) {
                compare = (String) txt;
            }
        }
        return compare;
    }

    private static <T> void Swap(int num1, int num2, List<T> inputList) {

        Collections.swap(inputList, num1, num2);
    }

    private static <T> boolean Contains(String element, List<T> inputList) {
        return inputList.contains(element);
    }

    private static <T> void Remove(int element, List<T> inputList) {

        inputList.remove(element);
    }
}