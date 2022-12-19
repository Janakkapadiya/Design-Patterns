package DesignPatterns.FactoryDesign;

public class FactoryClass {

    private FactoryClass() {
    }

    public static Vehicle getInstance(String type,String fuelType)
    {
        if(type == null)
        {
            return null;
        }
        else if(type.equals("car") && fuelType.equals("diesel"))
        {
            return new Car(fuelType);
        }
        else if(type.equals("bike") && fuelType.equals("petrol"))
        {
            return new Bike(fuelType);
        }
        return null;
    }
}
