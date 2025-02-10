package org.rituraj.February.Assignment2.Level1.LibraryBookSystem;

class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have successfully borrowed: " + title);
            isAvailable = false;
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 15.99, true);
        book1.displayBookDetails();
        book1.borrowBook();
        book1.displayBookDetails();
        book1.borrowBook(); // Trying to borrow again
    }
}
