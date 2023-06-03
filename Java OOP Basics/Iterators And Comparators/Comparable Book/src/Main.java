public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", 2008, "Robert Martin");
        Book book1 = new Book("Clean Code", 2020);
        Book book2 = new Book("Clean Code", 2008, "Author1", "Author2", "Author3");
        Book book3 = new Book("Test", 2008);

        System.out.println(book.compareTo(book1));
        System.out.println(book.compareTo(book2));
        System.out.println(book.compareTo(book3));
    }
}