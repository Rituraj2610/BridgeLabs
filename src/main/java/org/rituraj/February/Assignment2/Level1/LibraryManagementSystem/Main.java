package org.rituraj.February.Assignment2.Level1.LibraryManagementSystem;

// Main class
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("978", "Java Programming", "RJ");
        Book book2 = new Book("913472", "Data Structures", "Unkown");

        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();
    }
}
