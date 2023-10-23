package models;

public class User {
    private static int idCounter = 0; // for auto-generating user IDs
    private int userID;
    private String username;
    private String hashedPassword;
    private String email;
    private ShoppingCart cart;

    public User(String username, String hashedPassword, String email) {
        this.userID = ++idCounter;
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.email = email;
        this.cart = new ShoppingCart();
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public void register() {

    }

    public void login() {

    }

    public void logout() {

    }

    public void addToCart(Book book) {
        cart.addBook(book);
    }

    public void removeFromCart(Book book) {
        cart.removeBook(book);
    }

    public void purchase() {
        // In a real-world scenario, you'd check out and make a payment. Here, we'll just clear the cart
        cart.clearCart();
    }

    @Override
    public String toString() {
        return "User [userID=" + userID + ", username=" + username + ", email=" + email + "]";
    }
}
