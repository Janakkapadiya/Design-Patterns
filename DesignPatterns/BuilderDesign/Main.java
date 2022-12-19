package DesignPatterns.BuilderDesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static final Logger log = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) {
       Vehicle car = new Vehicle.VehicleBuilder(4,4).setAirBags(2).build();
       Vehicle bike = new Vehicle.VehicleBuilder(2,2).build();
       log.info(String.valueOf(car.getLights()));
       log.info(String.valueOf(bike.getAirBags()));
    }
}
