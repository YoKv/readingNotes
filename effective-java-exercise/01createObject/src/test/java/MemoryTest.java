import MemoryLeak.Stack;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Yo on 2017/4/22.
 */
public class MemoryTest {
    @Before
    public void  before(){
        Date date = new Date();
        System.out.println(date);
    }

    @Test
    public void testMemory() throws Exception{
        // 内存泄漏
        Stack stack = new Stack();
        Date date = new Date();
        for(int i =0;i<100;i++){
            for(int j =0;j<10000000;j++){
                stack.push(j);
            }
            for(int j =0;j<10000000;j++){
                stack.pop();
            }
        }
        Date date2 = new Date();
        System.out.println("内存泄漏"+(date2.getTime()-date.getTime()));
    }
    @Test
    public void testMemory2() {
        //内存释放
        Stack stack2 = new Stack();
        Date date3 = new Date();
        for(int i =0;i<100;i++){
            for(int j =0;j<10000000;j++){
                stack2.push(j);
            }
            for(int j =0;j<10000000;j++){
                stack2.popRelease();
            }
        }
        Date date4 = new Date();
        System.out.println("内存释放"+(date4.getTime()-date3.getTime()));

    }

    @After
    public void after(){
        Date date = new Date();
        System.out.println(date);
    }

}
