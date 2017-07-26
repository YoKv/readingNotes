package space.aiyo.gettingStarted;

/**
 * 机器猫
 */
public class Viking extends Animal {
    public Viking() {
        eatBehavior = new VikingEat();
        sleepBehavior = new VikingSleep();
    }

    @Override
    public void name() {
        System.out.println("My name is Viking.");
    }
}
