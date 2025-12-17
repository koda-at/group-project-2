public class Main {
    public static void main(String[] args) {


        Library library = new Library();

        Book book1 = new Book("Java Basics");
        Book book2 = new Book("Data Structures");
        Book book3 = new Book("Algorithms");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Member alice = new Member("Alice");
        Member bob = new Member("Bob");

        library.issueBook(alice, book1);

        library.issueBook(bob, book1);

        library.returnBook(alice, book1);
        library.issueBook(bob, book1);
    }
}
