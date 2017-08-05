package space.aiyo.singleton;

/**
 * 解决了Singleton1多线程问题
 * 存在性能问题，因为只有第一次getInstance才需要同步锁，后面的调用同步锁降低了性能
 *
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (null == instance) {
            instance = new Singleton3();
        }
        return instance;
    }
}
