import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackOfStrings {

    private List<String> data;

    public StackOfStrings() {
        data = new ArrayList<>();
    }

    public void push(String item) {

        this.data.add(item);
    }

    public String pop() {
        if (data.isEmpty()) {
            throw new EmptyStackException();
        }
        return data.remove(data.size() - 1);
    }

    public String peek() {
        if (data.isEmpty()) {
            throw new EmptyStackException();
        }
        return data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
