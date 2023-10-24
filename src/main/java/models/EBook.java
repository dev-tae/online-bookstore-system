package models;

public class EBook extends Book {
    private String downloadLink;
    private double fileSize;

    public EBook(String ISBN, String title, String author, double price, String downloadLink, double fileSize) {
        super(ISBN, title, author, price, Integer.MAX_VALUE);
        this.downloadLink = downloadLink;
        this.fileSize = fileSize;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "EBook [ISBN=" + super.getISBN() + ", title=" + super.getTitle() + ", author=" + super.getAuthor() + ", price=" + super.getPrice() + ", stock=" + super.getStockQuantity() + ",downloadLink=" + downloadLink + "]";
    }
}
