public class Main {
    public static void main(String[] args) {
    /*    Book book = new Book("Clean Code", 2008, "Robert Martin");
        Book book1 = new Book("Clean Code", 2020);
        Book book2 = new Book("Clean Code", 2008, "Author1", "Author2", "Author3");
        Book book3 = new Book("Test", 2008);

        System.out.println(book.compareTo(book1));
        System.out.println(book.compareTo(book2));
        System.out.println(book.compareTo(book3));*/

        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930,
                "Dorothy Sayers", "Robert Eustace");

        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s is before %s", bookOne, bookTwo));
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s is before %s", bookTwo, bookOne));
        } else {
            System.out.println("Book are equal");
        }
    }
}