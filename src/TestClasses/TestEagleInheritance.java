package TestClasses;

import inheritanceClasses.Eagle;

public class TestEagleInheritance {
    public static void main(String[] args){
        System.out.println("[TestEagleInheritance Class Start]");
        Eagle eagle = new Eagle();
        eagle.move();
        eagle.eat();
        eagle.flyup();
        eagle.flydown();
        System.out.println("reproduction " + eagle.reproduction);
        System.out.println("Outer covering: " + eagle.outerCovering);
        System.out.println("Eagle Name: " + eagle.name);
        System.out.println("Eagle age: " + eagle.age);
        System.out.println("[End of TestEagleInheritance Class]");
    }
}
