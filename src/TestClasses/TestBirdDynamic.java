package TestClasses;

import Polymorphism.Bird;
import inheritanceClasses.Animal;

public class TestBirdDynamic {
    public static void main(String[] args){
        System.out.println("Main Class");
        System.out.println("[TestBird Class Start]");
        Animal animal = new Animal();
        animal.eat();

        Bird bird = new Bird();
        bird.eat();


    }
}
