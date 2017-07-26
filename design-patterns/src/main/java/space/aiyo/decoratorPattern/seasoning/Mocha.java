package space.aiyo.decoratorPattern.seasoning;

import space.aiyo.decoratorPattern.Beverage;
import space.aiyo.decoratorPattern.CondimentDecorator;

/**
 * 调料类 摩卡
 * Created by tang on 2017/7/26.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha 0.20 ";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
