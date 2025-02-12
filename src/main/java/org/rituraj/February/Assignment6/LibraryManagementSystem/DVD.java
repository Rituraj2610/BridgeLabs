package org.rituraj.February.Assignment6.LibraryManagementSystem;

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;  // 3 days loan duration for DVDs
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("DVD reserved by: " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
