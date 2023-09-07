package TestClasses;

import inheritanceClasses.Bird;

public class TestBirdStatic {
    public static void main(String[] args){
        System.out.println("Main Class");
        System.out.println("[TestBird Class Start]");
        Bird bird = new Bird();
        bird.fly();
        bird.fly(1000);
        bird.fly("Eagle", 1000);
        System.out.println("[End of TestBird Class]");
    }
}
