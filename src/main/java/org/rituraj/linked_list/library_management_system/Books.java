package org.rituraj.linked_list.library_management_system;

import java.time.Year;

public class Books {
    private String bookTitle;
    private int id;
    private boolean available;
    private String author;
    private String genre;


    public Books(String bookTitle, String genre, String author, boolean available, int id) {
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.author = author;
        this.available = available;
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookTitle='" + bookTitle + '\'' +
                ", id=" + id +
                ", available=" + available +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
