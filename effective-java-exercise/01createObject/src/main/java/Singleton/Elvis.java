package Singleton;

/**
 * 饿汉模式
 * Created by Yo on 2017/4/21.
 */
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {

    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

}
