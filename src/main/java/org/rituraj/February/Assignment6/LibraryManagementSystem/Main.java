package org.rituraj.February.Assignment6.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<LibraryItem> libraryItems = new ArrayList<>();


        LibraryItem book = new Book("B001", "Java Programming", "A");
        LibraryItem magazine = new Magazine("M001", "Tech Monthly", "B");
        LibraryItem dvd = new DVD("D001", "Inception", "C");

        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);


        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");


            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Is Available: " + reservableItem.checkAvailability());
                reservableItem.reserveItem("Alice");
                System.out.println("Is Available after reservation: " + reservableItem.checkAvailability());
            }
        }
    }
}

