package space.aiyo.observer.jdk;

import java.util.Observable;

/**
 * JDK 实现
 * Created by tang on 2017/7/28.
 */
public class WeatherDataJdk extends Observable {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;


    /**
     * 数据更新时通知观察者
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    /**
     * 程序内改变气象信息
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
