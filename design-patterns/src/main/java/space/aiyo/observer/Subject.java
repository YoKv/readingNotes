package space.aiyo.observer;

/**
 * 主题类
 * Created by tang on 2017/7/28.
 */
public interface Subject {
    /**
     * 注册
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 主题状态变化时，通知观察者
     */
    void notifyObserver();
}
