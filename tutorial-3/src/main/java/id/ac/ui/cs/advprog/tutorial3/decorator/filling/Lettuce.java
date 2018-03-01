package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class Lettuce extends Food {
    Food food;

    public Lettuce(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", adding lettuce";
    }

    @Override
    public double cost() {
        return .75 + food.cost();
    }
}
