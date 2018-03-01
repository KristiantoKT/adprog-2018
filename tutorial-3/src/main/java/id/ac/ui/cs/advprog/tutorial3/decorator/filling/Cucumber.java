package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class Cucumber extends Food {
    Food food;

    public Cucumber(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", adding cucumber";
    }

    @Override
    public double cost() {
        return .4 + food.cost();
    }
}
