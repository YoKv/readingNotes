package space.aiyo.factory.factory;

import space.aiyo.factory.abstractFactory.NYPizzaIngredientFactory;
import space.aiyo.factory.abstractFactory.PizzaIngredientFactory;
import space.aiyo.factory.pizza.AbstractCheesePizza;
import space.aiyo.factory.pizza.AbstractPizza;

public class AbstractNYPizzaStore extends AbstractPizzaStore {
    @Override
    AbstractPizza createPizza(String item) {
        AbstractPizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (item) {
            case "cheese":
                pizza = new AbstractCheesePizza(ingredientFactory);
                break;
            default:
                break;
        }

        return pizza;
    }


}
