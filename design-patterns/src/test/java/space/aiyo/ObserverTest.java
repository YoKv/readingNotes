package space.aiyo;

import org.junit.Test;
import space.aiyo.observer.CurrentConditionDispaly;
import space.aiyo.observer.WeatherData;
import space.aiyo.observer.jdk.CurrentConditionDispalyJdk;
import space.aiyo.observer.jdk.WeatherDataJdk;

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

    @Test
    public void jdkTest() {
        WeatherDataJdk weatherDataJdk = new WeatherDataJdk();
        new CurrentConditionDispalyJdk(weatherDataJdk);

        weatherDataJdk.setMeasurements(42, 80, 50);
    }
}
