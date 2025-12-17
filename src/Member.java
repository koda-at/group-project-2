import java.util.ArrayList;

public class Member {
    private String name;
    private ArrayList<Loan> loans = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public void removeLoan(Book book) {
        loans.removeIf(loan -> loan.getBook() == book);
    }

    public String getName() {
        return name;
    }
}
