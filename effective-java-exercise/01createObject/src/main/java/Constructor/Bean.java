package Constructor;

/**
 * Created by Yo on 2017/4/21.
 */
public class Bean {

    private int a = 0;
    private int b = 1;
    private int c = 2;

    Bean() {
    }


    public void setA(int a) {
        this.a = a;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setB(int b) {

        this.b = b;
    }

}
//调用

class test {
    public static void main(String[] args) {
        Bean be = new Bean();
        be.setA(34);
    }
}
