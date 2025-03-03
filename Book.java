package pa4;


public class Book {
    // Private instance variables
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to apply discount
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    @Override
    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", Price=$" + price + "]";
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 19.99);
        System.out.println(book);

        book.applyDiscount(10);
        System.out.println("After applying 10% discount:");
        System.out.println(book);
    }
}