package org.rituraj.February.Assignment5.AssistedProblems.AnimalHierarchy;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setAge(10);
        dog.setName("Robin");

        Animal cat = new Cat();
        cat.setAge(10);
        cat.setName("Baskin");

        Animal bird = new Bird();
        bird.setAge(10);
        bird.setName("Hawk");

        Animal animal = new Animal();
        bird.setAge(10);
        bird.setName("Animal");

        System.out.println(dog);
        dog.makeSound();
        System.out.println(cat);
        cat.makeSound();
        System.out.println(bird);
        bird.makeSound();
        System.out.println(animal);
        animal.makeSound();
    }
}
