package space.aiyo.decoratorPattern.seasoning;

import space.aiyo.decoratorPattern.Beverage;
import space.aiyo.decoratorPattern.CondimentDecorator;

/**
 * 调料类 Whip
 * Created by tang on 2017/7/26.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip 0.15 ";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
