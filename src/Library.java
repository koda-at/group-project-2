import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    private boolean hasBook(Book book) {
        return books.contains(book);
    }

    public void issueBook(Member member, Book book) {

        if (!hasBook(book)) {
            System.out.println("Book does not exist in the library.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book '" + book.getTitle() + "' is already loaned.");
            return;
        }

        Loan loan = new Loan(member, book);
        member.addLoan(loan);
        book.markLoaned();

        System.out.println("Book '" + book.getTitle() + "' issued to " + member.getName());
    }

    public void returnBook(Member member, Book book) {

        if (!hasBook(book)) {
            System.out.println("Book does not belong to this library.");
            return;
        }

        book.markReturned();
        member.removeLoan(book);

        System.out.println("Book '" + book.getTitle() + "' returned by " + member.getName());
    }
}
