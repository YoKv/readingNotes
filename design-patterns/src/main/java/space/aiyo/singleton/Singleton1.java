package space.aiyo.singleton;

public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (null == instance) {
            instance = new Singleton1();
        }
        return instance;
    }
}
