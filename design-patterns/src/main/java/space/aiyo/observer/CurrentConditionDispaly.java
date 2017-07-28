package space.aiyo.observer;

/**
 * 目前状态布告栏
 * Created by tang on 2017/7/28.
 */
public class CurrentConditionDispaly implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDispaly(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentCondition temperature: " + temperature + " humidity: " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;

        display();
    }
}
