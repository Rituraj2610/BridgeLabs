package org.rituraj.February.JavaPlan._05_2025.BirdSanctuary.models;

public class SwimableBirds extends Bird implements Swimable{
    public SwimableBirds(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming");
    }
}
