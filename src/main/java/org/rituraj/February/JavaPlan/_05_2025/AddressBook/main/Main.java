package org.rituraj.February.JavaPlan._05_2025.AddressBook.main;

import org.rituraj.February.JavaPlan._05_2025.AddressBook.models.AddressBook;
import org.rituraj.February.JavaPlan._05_2025.AddressBook.models.Person;

public class Main {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        Person p1 = new Person("Hary", 1111111111, "something", "harry@gmail.com");
        Person p2 = new Person("Happy", 222222222, "something", "happy@gmail.com");
        Person p3 = new Person("roituraj", 333333333, "something", "rituraj@gmail.com");
        Person p4 = new Person("someone", 444444444, "something", "someone@gmail.com");
        Person p5 = new Person("someone", 444444444, "something", "someone@gmail.com");

        addressBook.addPerson(p1);
        addressBook.addPerson(p2);
        addressBook.addPerson(p3);
        addressBook.addPerson(p4);
        addressBook.addPerson(p5);

        addressBook.removePerson("Harry");

        addressBook.findPersonByName("Happy");
        addressBook.findPersonByName("Harry");
        addressBook.findPersonByPhoneNumber(1111111111);

        addressBook.updatePerson("Happy", p1);
    }
}
