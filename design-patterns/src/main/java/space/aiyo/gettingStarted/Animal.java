package space.aiyo.gettingStarted;

public abstract class Animal {
    protected EatBehavior eatBehavior;
    protected SleepBehavior sleepBehavior;

    /**
     * 名字
     */
    public abstract void name();

    public void eat() {
        eatBehavior.eat();
    }

    public void sleep(){
        sleepBehavior.sleep();
    }

    public void setEatBehavior(EatBehavior eatBehavior) {
        this.eatBehavior = eatBehavior;
    }

    public void setSleepBehavior(SleepBehavior sleepBehavior) {
        this.sleepBehavior = sleepBehavior;
    }
}
