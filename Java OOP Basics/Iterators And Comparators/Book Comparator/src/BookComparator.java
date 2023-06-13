import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String... authors) {
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    @Override
    public int compare(Book first, Book second) {
        if (first.getTitle().compareTo(second.getTitle()) == 0) {

            if (first.getYear() > second.getYear()) {
                return 1;
            } else if (first.getYear() < second.getYear()) {
                return -1;
            } else {
                return 0;

            }
        } else {
            return first.getTitle().compareTo(second.getTitle());
        }
    }
}
