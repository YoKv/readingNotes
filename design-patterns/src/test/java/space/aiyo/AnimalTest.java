package space.aiyo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import space.aiyo.gettingStarted.Animal;
import space.aiyo.gettingStarted.Cat;
import space.aiyo.gettingStarted.CatEat2;
import space.aiyo.gettingStarted.Viking;


public class AnimalTest {
    @Test
    public void test(){
        Animal cat = new Cat();
        cat.name();
        cat.eat();
        cat.sleep();
        cat.setEatBehavior(new CatEat2());
        cat.eat();

        Animal viking = new Viking();
        viking.name();
        viking.eat();
        viking.sleep();
    }
}
