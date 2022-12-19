package DesignPatterns.FactoryDesign;

import java.util.logging.Logger;

public class Car extends Vehicle{

    public static final Logger log = Logger.getLogger(String.valueOf(Car.class));
    public Car(String fuelType) {
        super(fuelType);
    }

    @Override
    public void capacity() {
        log.info("200L");
    }
}
