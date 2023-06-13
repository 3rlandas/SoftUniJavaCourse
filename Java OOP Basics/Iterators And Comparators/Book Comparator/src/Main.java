import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", 2008, "Robert Martin");
        Book book1 = new Book("Clean Code", 2020);
        Book book2 = new Book("Clean Code", 2008, "Author1", "Author2", "Author3");


        List<Book> bookList = new ArrayList<>(Arrays.asList(book, book1, book2));

        BookComparator bookComparator = new BookComparator();
        Collections.sort(bookList, bookComparator);

        bookList.forEach(currentBook ->{

            System.out.printf("Title: %s written in %d%n", currentBook.getTitle());
        });
    }
}