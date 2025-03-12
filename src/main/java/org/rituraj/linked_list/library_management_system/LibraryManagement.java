package org.rituraj.linked_list.library_management_system;

import java.time.Year;

public class LibraryManagement {

    Node head;
    Node tail;

    LibraryManagement() {
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        LibraryManagement libraryManagement = new LibraryManagement();

        // Sample books
        Books book1 = new Books("To Kill a Mockingbird", "Fiction", "Harper Lee", true, 1);
        Books book2 = new Books("1984", "Dystopian", "George Orwell", true, 2);
        Books book3 = new Books("The Great Gatsby", "Classic", "F. Scott Fitzgerald", true, 3);
        Books book4 = new Books("Moby Dick", "Adventure", "Herman Melville", true, 4);
        Books book5 = new Books("Pride and Prejudice", "Romance", "Jane Austen", false, 5);
        Books book6 = new Books("War and Peace", "Historical", "Leo Tolstoy", true, 6);

        // 1. Insert books
        libraryManagement.insertFirst(book1); // Add to beginning
        libraryManagement.insertFirst(book2); // Add to beginning
        libraryManagement.insertLast(book3);  // Add to end
        libraryManagement.insertLast(book4);  // Add to end
        libraryManagement.insertAtIndex(book5, 2); // Add at index 2
        libraryManagement.insertAtIndex(book6, 4); // Add at index 4

        System.out.println("After inserting books:");
        libraryManagement.displayForward();

        // 2. Delete a book by ID
        libraryManagement.deleteById(3); // Delete book with ID 3
        System.out.println("\nAfter deleting book with ID 3:");
        libraryManagement.displayForward();

        // 3. Search for a book by title
        int titleIndex = libraryManagement.searchByTitle("Pride and Prejudice");
        if (titleIndex != -1) {
            System.out.println("\nBook 'Pride and Prejudice' found at index: " + titleIndex);
        }

        // 4. Search for a book by author
        int authorIndex = libraryManagement.searchByAuthor("Leo Tolstoy");
        if (authorIndex != -1) {
            System.out.println("\nBook by 'Leo Tolstoy' found at index: " + authorIndex);
        }

        // 5. Update the availability of a book
        libraryManagement.updateBook(false, "War and Peace"); // Set 'War and Peace' as unavailable
        System.out.println("\nAfter updating availability of 'War and Peace':");
        libraryManagement.displayForward();

        // 6. Display the list in reverse order
        System.out.println("\nDisplaying books in reverse order:");
        libraryManagement.displayReverse();

        // 7. Display the total number of books
        libraryManagement.totalBooks();
    }


    // Insert at the beginning
    public void insertFirst(Books m) {
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
    public void insertLast(Books s) {
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
    public void insertAtIndex(Books s, int i) {
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
        public void deleteById(int id) {
        if (head == null) return;

        Node curr = head;

        // If head needs to be deleted
        if (head.data.getId() == id) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            return;
        }

        // If tail needs to be deleted
        if (tail.data.getId() == id) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            return;
        }

        // Searching for the node to delete
        while (curr != null && curr.data.getId() != id) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("No book found!");
        } else {
            if (curr.prev != null) curr.prev.next = curr.next;
            if (curr.next != null) curr.next.prev = curr.prev;
        }
    }

    // Search by director
    public int searchByTitle(String title) {
        int index = 0;
        Node curr = head;

        while (curr != null) {
            if (curr.data.getBookTitle().equals(title)) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        System.out.println("No book found!");
        return -1;
    }

    // Search by author
    public int searchByAuthor(String title) {
        int index = 0;
        Node curr = head;

        while (curr != null) {
            if (curr.data.getAuthor().equals(title)) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        System.out.println("No book found!");
        return -1;
    }


    // Update availability
    public void updateBook(boolean aval, String name) {
        Node curr = head;

        while (curr != null) {
            if (curr.data.getBookTitle().equals(name)) {
                curr.data.setAvailable(aval);
                return;
            }
            curr = curr.next;
        }
        System.out.println("No book found!");
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

    public void totalBooks(){
        Node curr = head;
        int c  = 0;
        while(curr != null){
            curr = curr.next;
            c++;
        }

        System.out.println("Total Book count: " + c);
    }
}
