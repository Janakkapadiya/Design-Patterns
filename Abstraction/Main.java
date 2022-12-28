package Abstraction;

public class Main{
    public static void main(String[] args)
    {
        Parent child = new Child("janak", "kapadiya");
        child.sleep();
        child.eat();
        Parent.read();
    }
}
