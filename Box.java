package Lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private final ArrayList<T> fruits;

    public Box(){ fruits = new ArrayList<>(); }

    public float getWeight() { return fruits.size() == 0 ? 0 : fruits.size() * fruits.get(0).getWeight(); }

    public boolean compare(Box<?> otherBox) {
        return getWeight() == otherBox.getWeight();
    }

    public void replaceAllFruitsToOtherBox(Box<T> otherBox) {
        otherBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public void addFruit(T fruitToAdd) { fruits.add(fruitToAdd); }
}