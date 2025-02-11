package org.rituraj.February.Assignment5.AssistedProblems.AnimalHierarchy;

public class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
