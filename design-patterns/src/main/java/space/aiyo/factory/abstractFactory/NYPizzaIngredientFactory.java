package space.aiyo.factory.abstractFactory;

import space.aiyo.factory.ingredient.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough11();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese11();
    }

    @Override
    public Clams createClams() {
        return new Clams11();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni11();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce11();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Veggies11(), new Veggies12()};
        return veggies;
    }
}
