package DesignPatterns.AdapterDesign;

public class Sparow extends Bird{
    @Override
    void makeSound() {
      System.out.println("chi chi");
    }
    @Override
    void canFly() {
        System.out.println("sparow is flying");
    }
}
