package space.aiyo.gettingStarted;

public class Test {

    public static void main(String[] args) {
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
