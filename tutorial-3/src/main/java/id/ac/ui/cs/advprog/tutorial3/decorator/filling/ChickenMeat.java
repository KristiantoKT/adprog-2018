package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class ChickenMeat extends Food {
    Food food;

    public ChickenMeat(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", adding chicken meat";
    }

    @Override
    public double cost() {
        return 4.5 + food.cost();
    }
}
