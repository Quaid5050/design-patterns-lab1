package TestClasses;
import inheritanceClasses.Bird;

public  class TestBird{
    public static void main(String[] args){
        System.out.println("Main Class");
        System.out.println("[TestBird Class Start]");
        Bird bird = new Bird();
        bird.move();
        bird.eat();
        System.out.println("[End of TestBird Class]");
    }
}

