package space.aiyo.observer;

/**
 * 观察者
 * Created by tang on 2017/7/28.
 */
public interface Observer {
    /**
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp,float humidity,float pressure);

}
