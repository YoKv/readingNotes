import equals.ColorPoint;
import equals.Point;
import org.junit.Test;

/**
 * Created by Yo on 2017/4/22.
 */
public class equalsTest {
    @Test
    public void extendsTest(){
        ColorPoint colorPoint = new ColorPoint(1,2,"red");
        Point point = new Point(1,2);

        boolean result1 = colorPoint.equals(point);
        boolean result2 = point.equals(colorPoint);

        ColorPoint colorPoint2 = new ColorPoint(1,2,"blue");
        Point point2 = new Point(1,2);

        boolean result3 = colorPoint2.equals(point2);
        boolean result4 = colorPoint2.equals(colorPoint);
        boolean result5 = colorPoint.equals(colorPoint2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }
}
