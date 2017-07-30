package space.aiyo.factory.abstractFactory;

import space.aiyo.factory.pizza.Pizza;
import space.aiyo.factory.simpleFactory.SimplePizzaFactory;

public abstract class AbstractPizzaStore {
    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
