package org.rituraj.February.assignment4.assisted_problems.libraray_and_books;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "A");
        Book book2 = new Book("A", "Harper Lee");

        Library library1 = new Library();
        library1.addBook(book1);
        library1.addBook(book2);

        System.out.println("Books in Library 1:");
        library1.displayBooks();

        Library library2 = new Library();
        library2.addBook(book1);

        System.out.println("Books in Library 2:");
        library2.displayBooks();
    }
}
