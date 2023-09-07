package TestClasses;

import Interfaces.Bird;
import Interfaces.Eagle;

public class TestEagleInterfaces {
    public static void main(String[] args){
        System.out.println("[TestEagleInterfaces Class Start]");
        Eagle eagle = new Eagle();
        eagle.move();
        eagle.eat();
        eagle.fly();
        //we can access direct static variable from Bird Interface
        System.out.println("Number of legs: " + Bird.numberOfLegs);
        System.out.println("Outer covering: " + Bird.outerCovering);
        System.out.println("[End of TestEagleInterfaces Class]");
    }
}
