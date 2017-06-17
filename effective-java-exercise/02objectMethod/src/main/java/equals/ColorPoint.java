package equals;

/**
 * Created by Yo on 2017/4/22.
 */
public class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x,int y,String color){
        super(x,y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPoint)){
            return false;
        }
        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }
}
