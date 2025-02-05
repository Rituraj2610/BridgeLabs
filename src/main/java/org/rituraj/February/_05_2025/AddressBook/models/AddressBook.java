package org.rituraj.February._05_2025.AddressBook.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class AddressBook implements CRUD, Searchable{
    private List<Person> adress = new ArrayList<>();

    @Override
    public String findPersonByPhoneNumber(long number) {
        for(Person p : adress){

            if(p.getNumber() == number){
                return p.toString();
            }
        }
        return "No contact found!";
    }

    @Override
    public String findPersonByName(String name) {
        for(Person p : adress){
            if(p.getName() == name){
                return p.toString();
            }
        }
        return "No contact found!";
    }

    @Override
    public void updatePerson(String name, Person p) {
        for(Person a : adress){
            if(a.getName() == name){
                a = p;
                System.out.println(name +  " updated successfully!");
                return;
            }
        }
        System.out.println("No contact found!");
    }

    @Override
    public void removePerson(String name) {
        for(int i =0; i<adress.size(); i++){
            if(adress.get(i).getName() == name){
                adress.remove(i);
                System.out.println(name +  " added successfully!");
                return;
            }
        }
        System.out.println("No contact found!");
    }

    @Override
    public void addPerson(Person p) {
        for (int i = 0; i < adress.size(); i++) {
            if (adress.get(i).getNumber() == p.getNumber()) {
                System.out.println("Contact already exists!!");
                        return;
            }
        }
        adress.add(p);
        System.out.println("Person " + p + " added successfully!");
    }

}
