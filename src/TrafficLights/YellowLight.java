package TrafficLights;
import java.util.Random;

public class YellowLight extends TrafficLight
{
    public YellowLight()
    {
        super("Yellow");
    }

    @Override
    public TrafficLight next()
    {
        randomDelay();
        notifyObservers();
        return new YellowLight();
    }

    private void randomDelay()
    {
        int delay = new Random().nextInt(3000) + 1000;
        try
        {
            System.out.println("Yellow light... waiting " + delay + "ms");
            Thread.sleep(delay);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

