package DesignPatterns.AdapterDesign;

public class Duck extends Toy{
    @Override
    void makeSound() {
      System.out.println("quek quek");
    }
}
