package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class Tomato extends Food {
    Food food;

    public Tomato(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", adding tomato";
    }

    @Override
    public double cost() {
        return .5 + food.cost();
    }
}
