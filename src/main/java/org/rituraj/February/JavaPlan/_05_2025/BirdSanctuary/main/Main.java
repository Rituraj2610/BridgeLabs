package org.rituraj.February.JavaPlan._05_2025.BirdSanctuary.main;

import org.rituraj.February.JavaPlan._05_2025.BirdSanctuary.models.FlyableBirds;
import org.rituraj.February.JavaPlan._05_2025.BirdSanctuary.models.SwimableBirds;
import org.rituraj.February.JavaPlan._05_2025.BirdSanctuary.models.SwimmableFlyable;

public class Main {
    public static void main(String[] args) {

        FlyableBirds eagle = new FlyableBirds("Eagle");
        SwimableBirds penguin = new SwimableBirds("Penguin");
        SwimmableFlyable duck = new SwimmableFlyable("Duck");

        eagle.fly();
        duck.swim();
        duck.fly();
        penguin.swim();
    }
}
