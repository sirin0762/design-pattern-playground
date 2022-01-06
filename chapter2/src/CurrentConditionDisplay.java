package chapter2;

import java.text.MessageFormat;

public class CurrentConditionDisplay implements Observer, DisplayElement{

    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(
            MessageFormat.format(
                "Current conditions - temperature({0} F degree), humidity({1} %)",
                temperature,
                humidity)
        );
    }
}
