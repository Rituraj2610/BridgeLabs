package org.rituraj.February.Assignment5.SingleInheritence.LibraryManagement;

public class Author extends Book{
    private String bio;

    Author(String title, int year, String bio){
        super(title, year);
        this.bio = bio;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.printf("Bio: %s %n", bio);
    }
}
