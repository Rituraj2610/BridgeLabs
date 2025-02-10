package org.rituraj.February.Assignment2.Level1.PersonClone;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Rituraj", 13);
        Person p2 = new Person(p1);

        System.out.println(p2);
    }
}
