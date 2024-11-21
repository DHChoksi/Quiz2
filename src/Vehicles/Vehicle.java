package Vehicles;

public abstract class Vehicle implements Observer
{
    private String m_Brand;

    public Vehicle(String brand)
    {
        this.m_Brand = brand;
    }

    public String getBrand()
    {
        return m_Brand;
    }

    @Override
    public void update(String color)
    {
        System.out.println(getBrand() + " has been notified of Traffic Light change to: " + color);
    }

    public abstract void displayDetails();
}
