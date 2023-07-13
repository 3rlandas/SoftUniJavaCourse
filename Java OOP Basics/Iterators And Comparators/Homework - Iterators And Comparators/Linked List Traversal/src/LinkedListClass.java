import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedListClass implements Iterable<Integer> {

    List<Integer> list;

    public LinkedListClass() {

        this.list = new ArrayList<>();

    }

    public void add(Integer input) {
        this.list.add(input);
    }

    public boolean remove(Integer input) {

        return this.list.remove(input);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public Integer next() {
                return list.get(index++);
            }
        };
    }

    public int getSize() {
        return this.list.size();
    }
}