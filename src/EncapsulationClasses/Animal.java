package EncapsulationClasses;

public class Animal {
    private String name;
    private int age;
    private String color;


    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public String getColor(){
        return this.color;
    }
}
