package org.rituraj.linked_list.movie_management_system;

import java.time.Year;

public class MovieManagement {

    Node head;
    Node tail;

    MovieManagement() {
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", 9, Year.of(2010), "Christopher Nolan");
        Movie movie2 = new Movie("The Shawshank Redemption", 10, Year.of(1994), "Frank Darabont");
        Movie movie3 = new Movie("Parasite", 8, Year.of(2019), "Bong Joon-ho");
        Movie movie4 = new Movie("The Dark Knight", 9, Year.of(2008), "Christopher Nolan");
        Movie movie5 = new Movie("Interstellar", 10, Year.of(2014), "Christopher Nolan");
        Movie movie6 = new Movie("The Godfather", 10, Year.of(1972), "Francis Ford Coppola");

        MovieManagement movieManagement = new MovieManagement();
        System.out.println("Inserting data\n");

        movieManagement.insertFirst(movie2);
        movieManagement.insertFirst(movie1);
        movieManagement.insertLast(movie3);
        movieManagement.insertLast(movie5);
        movieManagement.insertAtIndex(movie6, 3);
        movieManagement.displayForward();

        System.out.println("Deleting data\n");
        movieManagement.deleteByMovieTitle("Parasite");
        movieManagement.displayForward();

        System.out.println("Searching data");
        System.out.println(movieManagement.searchByRating(10));
        System.out.println();
        System.out.println(movieManagement.searchByDirector("Christopher Nolan"));
        System.out.println();

        System.out.println("Updating data\n");
        movieManagement.updateRatingByTitle(7, "Interstellar");
        movieManagement.displayForward();
        movieManagement.displayReverse();
    }

    // Insert at the beginning
    public void insertFirst(Movie m) {
        Node n = new Node(m);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    // Insert at the end
    public void insertLast(Movie s) {
        Node n = new Node(s);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    // Insert at a specific index
    public void insertAtIndex(Movie s, int i) {
        if (i == 0) {
            insertFirst(s);
            return;
        }

        Node curr = head;
        int c = 0;
        while (curr != null && c < i - 1) {
            curr = curr.next;
            c++;
        }

        if (curr == null || curr.next == null) {
            insertLast(s);
        } else {
            Node n = new Node(s);
            n.next = curr.next;
            if (curr.next != null) curr.next.prev = n;
            curr.next = n;
            n.prev = curr;
        }
    }

    // Delete by movie title
    public void deleteByMovieTitle(String mt) {
        if (head == null) return;

        Node curr = head;

        // If head needs to be deleted
        if (head.data.getMovieTitle().equals(mt)) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            return;
        }

        // If tail needs to be deleted
        if (tail.data.getMovieTitle().equals(mt)) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            return;
        }

        // Searching for the node to delete
        while (curr != null && !curr.data.getMovieTitle().equals(mt)) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("No movie found!");
        } else {
            if (curr.prev != null) curr.prev.next = curr.next;
            if (curr.next != null) curr.next.prev = curr.prev;
        }
    }

    // Search by director
    public int searchByDirector(String director) {
        int index = 0;
        Node curr = head;

        while (curr != null) {
            if (curr.data.getDirector().equals(director)) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        System.out.println("No movie found!");
        return -1;
    }

    // Search by rating
    public int searchByRating(int rating) {
        int index = 0;
        Node curr = head;

        while (curr != null) {
            if (curr.data.getRating() == rating) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        System.out.println("No movie found!");
        return -1;
    }

    // Update movie rating by title
    public void updateRatingByTitle(int rating, String mt) {
        Node curr = head;

        while (curr != null) {
            if (curr.data.getMovieTitle().equals(mt)) {
                curr.data.setRating(rating);
                return;
            }
            curr = curr.next;
        }
        System.out.println("No movie found!");
    }

    // Display list forward
    public void displayForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            System.out.println("  ==>  ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    // Display list in reverse
    public void displayReverse() {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data);
            System.out.println("  ==>  ");
            curr = curr.prev;
        }
        System.out.println("NULL");
    }
}
