import java.util.ArrayList;
import java.util.Arrays;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private ArrayList<String> authors;

    public Book(String title, int year, String... authors) {
        this.setAuthors(authors);
        this.setTitle(title);
        this.setYear(year);
    }

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
    public int compareTo(Book book) {
        if (this.getTitle().compareTo(book.getTitle()) == 0) {

            if (this.getYear() > book.getYear()) {
                return 1;
            } else if (this.getYear() < book.getYear()) {
                return -1;
            } else {
                return 0;

            }
        } else {
            return this.getTitle().compareTo(book.getTitle());
        }
    }
}