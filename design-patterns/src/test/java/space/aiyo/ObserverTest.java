package space.aiyo;

import org.junit.Test;
import space.aiyo.observer.CurrentConditionDispaly;
import space.aiyo.observer.WeatherData;

/**
 * Created by tang on 2017/7/28.
 */
public class ObserverTest {
    @Test
    public void test() {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionDispaly(weatherData);

        weatherData.setMeasurements(41, 70, 52);

    }
}
