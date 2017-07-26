package space.aiyo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import space.aiyo.decoratorPattern.Beverage;
import space.aiyo.decoratorPattern.coffee.DarkRoast;
import space.aiyo.decoratorPattern.coffee.Decaf;
import space.aiyo.decoratorPattern.coffee.Espresso;
import space.aiyo.decoratorPattern.seasoning.Mocha;
import space.aiyo.decoratorPattern.seasoning.Soy;
import space.aiyo.decoratorPattern.seasoning.Whip;

/**
 * Created by tang on 2017/7/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DecoratorPatternTest {

    @Test
    public void testt() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ",$" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + ",$" + beverage2.cost());

        Beverage beverage3 = new Decaf();
        beverage3 = new Whip(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + ",$" + beverage3.cost());
    }

}