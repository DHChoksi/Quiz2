package Vehicles;

public class Truck extends Vehicle
{
    public Truck(String brand)
    {
        super(brand);
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Truck Brand: " + getBrand());
    }
}
