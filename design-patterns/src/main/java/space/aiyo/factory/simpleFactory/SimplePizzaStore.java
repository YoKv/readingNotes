package space.aiyo.factory.simpleFactory;

import space.aiyo.factory.pizza.Pizza;

public class SimplePizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public SimplePizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
