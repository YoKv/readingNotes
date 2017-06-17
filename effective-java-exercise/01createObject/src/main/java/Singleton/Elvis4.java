package Singleton;

/**
 * 双重检查锁定
 * Created by Yo on 2017/4/22.
 */
public class Elvis4 {
    private volatile static Elvis4 INSTANCE;

    private Elvis4() {
    }

    public static Elvis4 getInstance() {
        if (INSTANCE == null) {
            synchronized (Elvis4.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Elvis4();
                }
            }
        }
        return INSTANCE;
    }
}
