package org.rituraj.February.Assignment6.LibraryManagementSystem;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

