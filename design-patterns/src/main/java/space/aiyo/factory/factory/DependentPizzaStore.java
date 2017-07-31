package space.aiyo.factory.factory;

import space.aiyo.factory.pizza.CheesePizza;
import space.aiyo.factory.pizza.Pizza;

public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {

        } else if (style.equals("Chicago")) {
            switch (type) {
                case "cheese":
                    pizza = new CheesePizza();
                    break;
                default:
                    break;
            }
        } else {
            return null;
        }

        return pizza;
    }


}
