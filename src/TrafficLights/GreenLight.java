package TrafficLights;
import java.util.Random;

public class GreenLight extends TrafficLight
{
    public GreenLight()
    {
        super("Green");
    }

    @Override
    public TrafficLight next()
    {
        randomDelay();
        notifyObservers();
        return new GreenLight();
    }

    private void randomDelay()
    {
        int delay = new Random().nextInt(3000) + 1000;
        try
        {
            System.out.println("Green light... waiting " + delay + "ms");
            Thread.sleep(delay);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

