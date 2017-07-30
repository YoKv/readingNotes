package space.aiyo.factory.abstractFactory;

import space.aiyo.factory.pizza.CheesePizza;
import space.aiyo.factory.pizza.Pizza;

public class ChicagoPizzaStore extends AbstractPizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            default:
                break;
        }

        return pizza;
    }

}
