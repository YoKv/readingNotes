package space.aiyo.observer;

import java.util.Vector;

/**
 *  主题是动物特征
 * Created by Yo on 2017/7/10.
 */
public class Animal implements MyObservable {
    private Vector<MyObserver> observers;

    public Animal(Vector<MyObserver> observers) {
        this.observers = observers;
    }

    @Override
    public void registerObserver(MyObserver observer) {
        if(null == observer)
            throw new NullPointerException();
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        if(observers.indexOf(observer) != -1)
            observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

    }
}
