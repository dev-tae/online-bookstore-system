package models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private static int orderCounter = 0;
    private int orderID;
    private int userID;
    private Map<Book, Integer> orderedBooks;
    private double totalAmount;
    private Date orderDate;

    public Order(int userID, Map<Book, Integer> orderedBooks) {
        this.orderID = ++orderCounter;
        this.userID = userID;
        this.orderedBooks = new HashMap<>(orderedBooks); // Copy the books from the cart
        this.totalAmount = calculateTotal();
        this.orderDate = new Date(); // Current date and time
    }

    public static int getOrderCounter() {
        return orderCounter;
    }

    public static void setOrderCounter(int orderCounter) {
        Order.orderCounter = orderCounter;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Map<Book, Integer> getOrderedBooks() {
        return orderedBooks;
    }

    public void setOrderedBooks(Map<Book, Integer> orderedBooks) {
        this.orderedBooks = orderedBooks;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Book, Integer> entry : orderedBooks.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", userID=" + userID + ", totalAmount=" + totalAmount + ", orderDate=" + orderDate + "]";
    }
}
