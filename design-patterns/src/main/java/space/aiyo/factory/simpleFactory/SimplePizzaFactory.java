package space.aiyo.factory.simpleFactory;

import space.aiyo.factory.pizza.CheesePizza;
import space.aiyo.factory.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
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
