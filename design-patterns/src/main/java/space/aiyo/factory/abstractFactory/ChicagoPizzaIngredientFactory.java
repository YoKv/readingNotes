package space.aiyo.factory.abstractFactory;

import space.aiyo.factory.ingredient.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough12();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese12();
    }

    @Override
    public Clams createClams() {
        return new Clams12();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni12();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce12();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Veggies11(), new Veggies12()};
        return veggies;
    }
}
