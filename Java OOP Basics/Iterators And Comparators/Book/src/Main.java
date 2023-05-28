public class Main {
    public static void main(String[] args) {

        Book book = new Book("Clean Code", 2008, "Robert Martin");
        Book book1 = new Book("Test book", 2023);
        Book book2 = new Book("Test book two", 2019, "Author1", "Author2", "Author3");

        book.getAuthors().forEach(System.out::println);
        book1.getAuthors().forEach(System.out::println);
        book2.getAuthors().forEach(System.out::println);

    }
}