package TestClasses;

import EncapsulationClasses.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal animal = new Animal();

        // Print the name of the animal
        animal.setName("Lion");
        System.out.println("Name of the animal: " + animal.getName());
        animal.setAge(5);
        System.out.println("Age of the animal: " + animal.getAge());
        animal.setColor("Orange");
        System.out.println("Color of the animal: " + animal.getColor());

    }
}