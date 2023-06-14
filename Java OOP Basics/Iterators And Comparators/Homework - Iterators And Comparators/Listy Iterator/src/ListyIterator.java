import java.util.List;

public class ListyIterator {

    private List<String> data;
    private int index;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ListyIterator(List<String> data) {
        this.data = data;
        if (data.isEmpty()) {
            this.index = -1;
        } else {
            this.index = 0;
        }

    }

    public boolean move() {

        if (this.index < this.data.size() - 1) {

            index++;
            return true;
        } else {
            return false;
        }
    }
}
