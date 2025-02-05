package org.rituraj.February._05_2025.BirdSanctuary.models;

public class SwimmableFlyable extends Bird implements Flyable, Swimable{
    public SwimmableFlyable(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.print(getName() + " can swim and ");
    }

    @Override
    public void fly() {
        System.out.println("fly.");
    }
}
