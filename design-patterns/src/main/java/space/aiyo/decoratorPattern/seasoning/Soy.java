package space.aiyo.decoratorPattern.seasoning;

import space.aiyo.decoratorPattern.Beverage;
import space.aiyo.decoratorPattern.CondimentDecorator;

/**
 * 调料类 Soy
 * Created by tang on 2017/7/26.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy 0.10 ";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
