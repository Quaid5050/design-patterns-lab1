package inheritanceClasses;
import AbstractClasses.Animal;

public class Bird extends Animal {

    public void move() {
        System.out.println("Moves by flying.");
    }

    public void eat() {
        System.out.println("Eats birdfood.");
    }

}
