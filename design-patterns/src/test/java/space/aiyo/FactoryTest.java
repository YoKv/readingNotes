package space.aiyo;

import org.junit.Test;
import space.aiyo.factory.abstractFactory.AbstractPizzaStore;
import space.aiyo.factory.abstractFactory.NYPizzaStore;

public class FactoryTest {

    @Test
    public void simpleFactory() {
    }

    @Test
    public void abstractFactory() {
        AbstractPizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }

}
