package TestClasses;

import inheritanceClasses.Fish;
public class TestFish {
    public static void main(String[] args){
        System.out.println("[TestFish Class Start]");
        Fish fish = new Fish();
        fish.move();
        fish.eat();
        System.out.println("[End of TestFish Class]");
    }
}
