package TrafficLights;
import Vehicles.Observable;
import Vehicles.Observer;
import java.util.ArrayList;
import java.util.List;

public abstract class TrafficLight implements Observable
{
    protected String m_Color;
    private List<Observer> m_Observers = new ArrayList<>();

    public TrafficLight(String color)
    {
        this.m_Color = color;
    }

    public String getColor()
    {
        return m_Color;
    }

    public abstract TrafficLight next();

    @Override
    public void addObserver(Observer observer)
    {
        m_Observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        m_Observers.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer : m_Observers) {
            observer.update(m_Color);
        }
    }
}

