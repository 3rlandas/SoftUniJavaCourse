import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    private static List<Integer> list;

    public Lake() {

        this.list = new ArrayList<>();

    }

    public static void Jump() {

        List<Integer> jumpOnList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (i % 2 == 0) {
                jumpOnList.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {

            if (i % 2 != 0) {
                jumpOnList.add(list.get(i));
            }
        }

        System.out.println(jumpOnList.toString().replaceAll("[\\[\\]]", ""));
    }

    public void push(int integer) {
        this.list.add(integer);
    }

    @Override
    public Iterator<Integer> iterator() {
        //return new CustomIterator();

        return null;
    }

   /* public class CustomIterator implements Iterator<Integer> {

        int indexPosition = 0;

        @Override
        public boolean hasNext() {
            return list.isEmpty();
        }

        @Override
        public Integer next() {
            int number = list.get(indexPosition);
            indexPosition++;
            return number;
        }
    }*/
}
