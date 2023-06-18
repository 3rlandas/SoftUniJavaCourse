import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Stack implements Iterable<Integer> {

    private Deque<Integer> stack;

    public Stack() {
        this.stack = new ArrayDeque<>();
    }

    public void push(int element) {
        this.stack.push(element);
    }

    public void pop() {

        if (iterator().hasNext()) {
            System.out.println("No elements");
        } else {
            this.stack.pop();
        }
    }

    public Iterator<Integer> iterator() {
        return new CustomIterator();
    }

    public void foreachCustom() {

        for (int value : this.stack) {
            System.out.println(value);
        }
    }

    private class CustomIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return stack.isEmpty();
        }

        @Override
        public Integer next() {
            return stack.peek();
        }
    }
}
