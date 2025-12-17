public class Book {
    private String title;
    private boolean available = true;

    public Book(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void markLoaned() {
        available = false;
    }

    public void markReturned() {
        available = true;
    }

    public String getTitle() {
        return title;
    }
}
