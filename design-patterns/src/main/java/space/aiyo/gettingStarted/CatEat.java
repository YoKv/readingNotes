package space.aiyo.gettingStarted;

public class CatEat implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("eat fish.");
    }
}
