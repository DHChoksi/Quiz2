package Vehicles;

import java.util.Observable;

public class Car extends Vehicle
{
    public Car(String brand)
    {
        super(brand);
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Car Brand: " + getBrand());
    }

    //@Override
    public void update(Observable o, Object arg) {

    }
}
