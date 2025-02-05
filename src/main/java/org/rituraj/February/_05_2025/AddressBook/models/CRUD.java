package org.rituraj.February._05_2025.AddressBook.models;

public interface CRUD {
    void addPerson(Person p);

    void removePerson(String name);

    void updatePerson(String name, Person p);
}
