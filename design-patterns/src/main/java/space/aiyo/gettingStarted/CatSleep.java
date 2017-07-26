package space.aiyo.gettingStarted;

public class CatSleep implements SleepBehavior {
    @Override
    public void sleep() {
        System.out.println("sleep everywhere.");
    }
}
