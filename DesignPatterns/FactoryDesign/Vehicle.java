package DesignPatterns.FactoryDesign;


//we use factory design pattern when we have multiple child class of the parent class
//and instad of creating the individual constructor for all the child class
//we create factory class ans pass the conditions
//ans as per the conditions the object will call the particular method of thr child class


public abstract class Vehicle {
    String fuelType;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    protected Vehicle(String fuelType) {
        this.fuelType = fuelType;
    }

    public abstract void capacity();
}
