package space.aiyo.decoratorPattern.coffee;

import space.aiyo.decoratorPattern.Beverage;

/**
 * Created by tang on 2017/7/26.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf 1.05 ";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}

