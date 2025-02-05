package org.rituraj.February._05_2025.BirdSanctuary.models;

public class FlyableBirds extends Bird implements Flyable{
    public FlyableBirds(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
