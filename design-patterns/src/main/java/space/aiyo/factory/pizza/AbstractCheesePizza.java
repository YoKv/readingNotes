package space.aiyo.factory.pizza;

import space.aiyo.factory.abstractFactory.PizzaIngredientFactory;

public class AbstractCheesePizza extends AbstractPizza {
    PizzaIngredientFactory ingredientFactory;

    public AbstractCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("prepare " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
