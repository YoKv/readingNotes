package space.aiyo.observer.jdk;

import space.aiyo.observer.DisplayElement;

import java.util.Observable;

/**
 * 目前状态布告栏
 * Created by tang on 2017/7/28.
 */
public class CurrentConditionDispalyJdk implements java.util.Observer, DisplayElement {
   Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionDispalyJdk(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentCondition temperature: " + temperature + " humidity: " + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataJdk){
            WeatherDataJdk weatherDataJdk = (WeatherDataJdk) o;
            this.temperature = weatherDataJdk.getTemperature();
            this.humidity = weatherDataJdk.getHumidity();
            display();
        }
    }

}
