package Interfaces;

public class Eagle implements Bird, Animal {
    public void move() {
        System.out.println("Moves by flying.");
    }

    public void eat() {
        System.out.println("Eats reptiles and amphibians.");
    }

    public void fly() {
        System.out.println("Flies up to 10,000 feet.");
    }

}

