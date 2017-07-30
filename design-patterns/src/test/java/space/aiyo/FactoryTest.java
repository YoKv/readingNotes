package space.aiyo;

import org.junit.Test;
import space.aiyo.factory.factory.PizzaStore;
import space.aiyo.factory.factory.ChicagoPizzaStore;
import space.aiyo.factory.factory.NYPizzaStore;
import space.aiyo.factory.pizza.Pizza;

public class FactoryTest {

    @Test
    public void simpleFactory() {
    }


    @Test
    public void abstractFactory() {
        PizzaStore NYPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza = NYPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());
        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());

    }

}
