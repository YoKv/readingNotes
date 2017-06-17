package Singleton;

/**
 * 懒汉模式
 * Created by Yo on 2017/4/22.
 */
public class Elvis2 {
    private static Elvis2 INSTANCE;

    private Elvis2() {
    }

    /**
     * 线程不安全
     *
     * @return
     */
    public static Elvis2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Elvis2();
        }
        return INSTANCE;
    }

    /**
     * 线程安全
     *
     * @return
     */
    public static synchronized Elvis2 getInstance2() {
        if (INSTANCE == null) {
            INSTANCE = new Elvis2();
        }
        return INSTANCE;
    }

}
