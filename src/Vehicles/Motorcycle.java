package Vehicles;

import java.util.Observable;

public class Motorcycle extends Vehicle
{
    public Motorcycle(String brand)
    {
        super(brand);
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Motorcycle Brand: " + getBrand());
    }

    //@Override
    public void update(Observable o, Object arg) {

    }
}
