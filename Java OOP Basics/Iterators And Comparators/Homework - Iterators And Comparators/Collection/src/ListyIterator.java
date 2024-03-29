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

    public boolean hasNext() {
        if (this.index + 1 <= this.data.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        if (this.data.isEmpty()) {

            System.out.println("Invalid Operation!");
        } else {
            System.out.println(this.data.get(this.index));
        }
    }

    public void printAll() {
        if (this.data.isEmpty()) {

            System.out.println("Invalid Operation!");
        } else {
            this.data.forEach((eachData) -> {
                System.out.printf("%s ", eachData);
            });
        }
        System.out.println();
    }
}
