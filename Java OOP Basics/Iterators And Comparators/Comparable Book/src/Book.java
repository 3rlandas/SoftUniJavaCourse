import java.util.ArrayList;
import java.util.Arrays;

public class Book implements Comparable<Book> {
    private String bookName;
    private int year;
    private ArrayList<String> authors;

    public Book(String name, int year, String... authors) {
        this.setAuthors(authors);
        this.setBookName(bookName);
        this.setYear(year);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
        if (this.getBookName().compareTo(book.getBookName()) == 0) {

            if (this.getYear() > book.getYear()) {
                return 1;
            } else if (this.getYear() < book.getYear()) {
                return -1;
            } else {
                return 0;

            }
        } else {
            return this.getBookName().compareTo(book.getBookName());
        }
    }
}
