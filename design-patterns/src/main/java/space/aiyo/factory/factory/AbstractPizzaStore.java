package space.aiyo.factory.factory;

import space.aiyo.factory.pizza.AbstractPizza;

public abstract class AbstractPizzaStore {
    abstract AbstractPizza createPizza(String type);

    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
