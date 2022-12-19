package DesignPatterns.FactoryDesign;

public class Main {
    public static void main(String[] args) {
        Vehicle car = FactoryClass.getInstance("car","diesel");
        car.capacity();

        Vehicle bike = FactoryClass.getInstance("bike","petrol");
        bike.capacity();
    }
}
