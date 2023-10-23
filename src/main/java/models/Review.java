package models;

public class Review {
    private static int reviewCounter = 0;
    private int reviewID;
    private int userID;
    private String ISBN; // Book's ISBN to associate the review with a book
    private int rating;
    private String textReview;

    public Review(int userID, String ISBN, int rating, String textReview) {
        this.reviewID = ++reviewCounter;
        this.userID = userID;
        this.ISBN = ISBN;
        this.rating = rating;
        this.textReview = textReview;
    }

    public static int getReviewCounter() {
        return reviewCounter;
    }

    public static void setReviewCounter(int reviewCounter) {
        Review.reviewCounter = reviewCounter;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTextReview() {
        return textReview;
    }

    public void setTextReview(String textReview) {
        this.textReview = textReview;
    }

    @Override
    public String toString() {
        return "Review [reviewID=" + reviewID + ", userID=" + userID + ", ISBN=" + ISBN + ", rating=" + rating + ", textReview=" + textReview + "]";
    }
}
