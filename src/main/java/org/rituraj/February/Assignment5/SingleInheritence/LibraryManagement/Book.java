package org.rituraj.February.Assignment5.SingleInheritence.LibraryManagement;

public class Book {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    void displayInfo(){
        System.out.printf("Title: %s, Year: %d", title, year);
    }
}
