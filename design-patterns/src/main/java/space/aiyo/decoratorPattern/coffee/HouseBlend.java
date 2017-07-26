package space.aiyo.decoratorPattern.coffee;

import space.aiyo.decoratorPattern.Beverage;

/**
 * Created by tang on 2017/7/26.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend 0.89 ";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

