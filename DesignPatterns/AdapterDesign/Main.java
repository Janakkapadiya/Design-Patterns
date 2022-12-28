package DesignPatterns.AdapterDesign;
public class Main {
    public static void main(String[] args)
    {
        Sparow sparow = new Sparow();
        Toy toy = new Duck();
        Toy birdAdapter = new BirdAdapter(sparow);

        sparow.canFly();
        sparow.makeSound();

        toy.makeSound();

        birdAdapter.makeSound();
    }
}
