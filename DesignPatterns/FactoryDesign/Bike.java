package DesignPatterns.FactoryDesign;

import java.util.logging.Logger;

public class Bike extends Vehicle {

    public static final Logger log = Logger.getLogger(String.valueOf(Bike.class));

    public Bike(String fuelType) {
        super(fuelType);
    }

    @Override
    public void capacity() {
       log.info("100L");
    }
}
