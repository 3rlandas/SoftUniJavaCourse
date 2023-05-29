import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", 2008, "Robert Martin");
        Book book1 = new Book("Test book", 2023);
        Book book2 = new Book("Test book two", 2019, "Author1", "Author2", "Author3");

        Library<Book> library = new Library<>(book, book1, book2);

        Iterator<Book> iterator = library.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }
}