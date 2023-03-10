package DesignPatterns.BuilderDesign;

//we create builder design pattern when we have multiple arguments
//and we don't want to mess up the constructor so we create setter for the optional param in subclass
//and finally we build the main class builder

public class Vehicle {

    //mandatory parts
    private final int wheels;
    private final int lights;

    //optional parts
    private final int airBags;

    public int getWheels() {
        return wheels;
    }

    public int getLights() {
        return lights;
    }

    public int getAirBags() {
        return airBags;
    }

    public Vehicle(VehicleBuilder vehicleBuilder)
    {
       this.wheels = vehicleBuilder.wheels;
       this.lights = vehicleBuilder.lights;
       this.airBags =vehicleBuilder.airBags;
    }

    public static class VehicleBuilder {
        private final int wheels;

        private final int lights;

        private int airBags;

        public VehicleBuilder(int wheels, int lights) {
            this.wheels = wheels;
            this.lights = lights;
        }

        public VehicleBuilder setAirBags(int airBags) {
            this.airBags = airBags;
            return this;
        }

        public Vehicle build()
        {
            return new Vehicle(this);
        }
    }
}
