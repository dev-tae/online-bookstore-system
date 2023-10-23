package models;

public class Book {

    private String ISBN;
    private String title;
    private String author;
    private double price;
    private int stockQuantity;

    // Constructor
    public Book(String ISBN, String title, String author, double price, int stockQuantity) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void updateBookDetails() {

    }

    // Modify book price
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // Modify stock quantity (can be both addition or subtraction)
    public void updateStock(int quantity) {
        this.stockQuantity += quantity;
        if (this.stockQuantity < 0) {
            this.stockQuantity = 0;
        }
    }

    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", price=" + price + ", stock=" + stockQuantity + "]";
    }

}
