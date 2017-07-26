package space.aiyo.decoratorPattern.coffee;

import space.aiyo.decoratorPattern.Beverage;

/**
 * Created by tang on 2017/7/26.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast 0.99 ";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}

