package models;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Book, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    // Add a book to the cart
    public void addBook(Book book) {
        items.put(book, items.getOrDefault(book, 0) + 1);

    }

    // Remove a book from the cart
    public void removeBook(Book book) {
        if (items.containsKey(book)) {
            int quantity = items.get(book);
            if (quantity > 1) {
                items.put(book, quantity - 1);
            } else {
                items.remove(book);
            }
        }

    }

    // Calculate the total price of items in the cart
    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    // Clear the cart
    public void clearCart() {
        items.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            sb.append(entry.getKey().getTitle()).append(" x ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }


}
