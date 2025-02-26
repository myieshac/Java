import java.util.Scanner;

class LibraryBook {
    private String title;
    private String author;
    private double price;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the title of the book: ");
        String title = sc.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = sc.nextLine();

        System.out.print("Enter the price of the book: ");
        double price = sc.nextDouble();

        LibraryBook book = new LibraryBook(title, author, price);

        System.out.println("\nBook Details:");
        book.displayDetails();

        sc.close();
    }
}