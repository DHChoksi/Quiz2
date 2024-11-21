import Vehicles.*;
import TrafficLights.*;

public class Main
{
    public static void main(String[] args)
    {

        System.out.println("Vehicle Simulation---------------------------------");
        Observer car = new Car("Toyota");
        Observer motorcycle = new Motorcycle("Harley-Davidson");
        Observer truck = new Truck("Volvo");

        ((Car) car).displayDetails();
        ((Motorcycle) motorcycle).displayDetails();
        ((Truck) truck).displayDetails();

        System.out.println("Traffic Light Simulation with Observer Pattern-------------------");
        System.out.println("\nStarting Traffic Light Simulation...");
        TrafficLight trafficLight = new RedLight();

        trafficLight.addObserver(car);
        trafficLight.addObserver(motorcycle);
        trafficLight.addObserver(truck);

        System.out.println("Traffic Light Changes--------------------------");
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Current Light: " + trafficLight.getColor());
            trafficLight = trafficLight.next();
        }
    }
}
