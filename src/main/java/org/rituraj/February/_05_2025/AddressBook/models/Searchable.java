package org.rituraj.February._05_2025.AddressBook.models;

public interface Searchable {
    String findPersonByName(String name);
    String findPersonByPhoneNumber(long number);
}
