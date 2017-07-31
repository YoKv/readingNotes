package space.aiyo.factory.pizza;

import space.aiyo.factory.abstractFactory.PizzaIngredientFactory;

public class AbstractClamPizza extends AbstractPizza {
    PizzaIngredientFactory ingredientFactory;

    public AbstractClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("prepare " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
    }
}
