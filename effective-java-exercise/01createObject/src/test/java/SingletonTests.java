import Singleton.Elvis;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by Yo on 2017/4/22.
 */
public class SingletonTests {
    /**
     * 反射，使用私有构造方法
     */

    @Test
    public void getClassTest() throws Exception {

        Class cla = Class.forName("Singleton.Elvis");

        Constructor constructor = cla.getDeclaredConstructor();
        constructor.setAccessible(true);
        Elvis elvis = (Elvis) constructor.newInstance();//反射调用构造方法产生实例

        Elvis elvis1 = Elvis.getInstance();//正常单例模式下产生实例
        //Elvis elvis2= (Elvis) Class.forName("Singleton.Elvis").newInstance(); //私有构造方法不能直接反射成功
        Elvis elvis3 = Elvis.getInstance();//正常单例模式下产生实例

        System.out.println(elvis.equals(elvis1));
        //System.out.println(elvis.equals(elvis2));
        //System.out.println(elvis1.equals(elvis2));
        System.out.println(elvis1.equals(elvis3));

    }
}
