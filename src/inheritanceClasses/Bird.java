package inheritanceClasses;
import AbstractClasses.Animal;

public class Bird extends Animal {
    public String reproduction = "egg";
    public String outerCovering = "feather";

    public void move() {

        System.out.println("Moves by flying.");
    }

    public void eat() {
        System.out.println("Eats birdfood.");
    }

    public void flyup(){
        System.out.println("Bird is flying up.");
    }

    public void flydown(){
        System.out.println("Bird is flying down.");
    }

}
