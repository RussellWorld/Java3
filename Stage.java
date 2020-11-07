package Lesson5.stage;

import Lesson5.Car;

public abstract class Stage {
    protected int length;
    protected String description;

    public abstract void go(Car c);
}
