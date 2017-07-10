package space.aiyo.observer;

/**
 * 主题subject 发布信息
 * Created by Yo on 2017/7/10.
 */
public interface MyObservable {
    /**
     * 注册观察者
     */
    void registerObserver(MyObserver observer);
    void removeObserver(MyObserver observer);

    /**
     * 状态改变通知观察者
     */
    void notifyObserver();

}
