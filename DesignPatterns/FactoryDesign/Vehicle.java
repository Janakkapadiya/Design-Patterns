package DesignPatterns.FactoryDesign;

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
