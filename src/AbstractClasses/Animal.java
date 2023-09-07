package AbstractClasses;

public abstract class Animal{
    public abstract void move();
    protected abstract void eat();

    void label(){
        System.out.println("Animal's data:");
    }
}