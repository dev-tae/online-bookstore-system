import models.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // 1. Create some books
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("12345", "Harry Porter", "J.K. Rowling", 20.0, 100);
        Book book2 = new Book("67890", "Lord of the Rings", "J.R.R. Tolkien", 25.0, 80);
        EBook book3 = new EBook("11111", "A Song of Ice and Fire", "George R. R. Martin", 10, "https://www.ebook.download", 1.00);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        for (Book book : bookList) {
            System.out.println(book);
        }

        // 2. Create a user and add books to their cart
        User user1 = new RegularUser("Tae Hyun", "password123", "taehyun@email.com");
        user1.addToCart(book1);
        user1.addToCart(book2);
        user1.addToCart(book3);
        System.out.println(user1);

        // 3. Simulate a purchase (this will clear the cart in our current implementation)
        user1.purchase();
        System.out.println(user1);

        // 4. Write a review for a book
        Review review1 = new Review(user1.getUserID(), book1.getISBN(), 5, "Great book!");
        System.out.println(review1);
    }
}
