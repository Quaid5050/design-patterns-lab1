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

    public void  fly()  {
        System.out.println("The bird is flying.");
    }
    public  void  fly(int height)  {
        System.out.println("The bird is flying "  + height +  " feet high.");
    }
    public  void  fly(String name,  int height)  {
        System.out.println("The "  + name +  " is flying "  + height +  " feet high.");
    }

}
