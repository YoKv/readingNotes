package space.aiyo.decoratorPattern;

/**
 * 饮料抽象类
 * Created by tang on 2017/7/26.
 */
public abstract class Beverage {
    protected String description = "unknown";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
