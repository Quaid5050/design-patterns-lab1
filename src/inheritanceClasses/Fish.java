package inheritanceClasses;
import AbstractClasses.Animal;

public class Fish extends Animal {

    public void move() {
        System.out.println("Moves by swimming.");
    }

    public void eat() {
        System.out.println("Eats seafood.");
    }
}
