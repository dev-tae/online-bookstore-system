package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bookstore {
    private List<Book> books = new ArrayList<>();
    private Map<Integer, User> users = new HashMap<>();
    private List<Order> orders = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();

    // Singleton pattern to ensure only one instance of Bookstore
    private static Bookstore instance = null;

    private Bookstore() {}

    public static Bookstore getInstance() {
        if (instance == null) {
            instance = new Bookstore();
        }
        return instance;
    }

    // Methods to manage books
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

}
