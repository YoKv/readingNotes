package space.aiyo.factory.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("name" + name);
        System.out.println("dough" + dough);
        System.out.println("sauce" + sauce);
        System.out.println("toppings" + toppings);

    }

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }
}
