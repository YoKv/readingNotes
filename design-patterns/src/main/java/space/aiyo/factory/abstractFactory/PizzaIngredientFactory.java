package space.aiyo.factory.abstractFactory;

import space.aiyo.factory.ingredient.*;

public interface PizzaIngredientFactory {
    Dough createDough();

    Cheese createCheese();

    Clams createClams();

    Pepperoni createPepperoni();

    Sauce createSauce();

    Veggies[] createVeggies();
}
