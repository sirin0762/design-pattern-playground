package chapter2;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(82, 22, 30.4f);
        weatherData.setMeasurements(85, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.7f);
    }
}
