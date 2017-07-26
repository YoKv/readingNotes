package space.aiyo.gettingStarted;

public class Cat extends Animal {
    public Cat() {
        this.eatBehavior = new CatEat();
        this.sleepBehavior = new CatSleep();
    }

    @Override
    public void name() {
        System.out.println("My name is cat.");
    }

}
