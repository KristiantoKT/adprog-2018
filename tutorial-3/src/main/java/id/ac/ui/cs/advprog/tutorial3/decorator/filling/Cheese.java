package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class Cheese extends Food {
    Food food;

    public Cheese(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", adding cheese";
    }

    @Override
    public double cost() {
        return 2.0 + food.cost();
    }
}
