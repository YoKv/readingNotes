package space.aiyo.decoratorPattern.coffee;

import space.aiyo.decoratorPattern.Beverage;

/**
 * 浓缩咖啡类
 * Created by tang on 2017/7/26.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso 1.99 ";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
