package DesignPatterns.AdapterDesign;

public class BirdAdapter extends Toy{
    public Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }
    @Override
    void makeSound() {
        bird.makeSound();
    }
}
