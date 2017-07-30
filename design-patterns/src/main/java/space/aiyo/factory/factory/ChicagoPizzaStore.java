package space.aiyo.factory.factory;

import space.aiyo.factory.pizza.CheesePizza;
import space.aiyo.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
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
