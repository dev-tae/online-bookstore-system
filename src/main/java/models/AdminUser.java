package models;

public class AdminUser extends User {
    public AdminUser(String username, String hashedPassword, String email) {
        super(username, hashedPassword, email);
    }

    @Override
    public void displayDashboard() {
        // Implementation specific to regular users
        System.out.println("Displaying admin dashboard for user: " + getUsername());
    }

    // Book management methods
    public void addBook(Book book) {
        Bookstore.getInstance().addBook(book);
    }

    public void removeBook(Book book) {
        Bookstore.getInstance().removeBook(book);
    }

    // Update book details (for simplicity, we're re-adding the book; in a real DB setup, this would be an update operation
    public void updateBook(Book book) {
        Bookstore.getInstance().removeBook(book);
        Bookstore.getInstance().addBook(book);
    }

    // List all books
    public void getAllBooks() {
        for (Book book : Bookstore.getInstance().getAllBooks()) {
            System.out.println(book);
        }
    }

}
