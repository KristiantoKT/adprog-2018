package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class TomatoSauce extends Food {
    Food food;

    public TomatoSauce(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", adding tomato sauce";
    }

    @Override
    public double cost() {
        return .2 + food.cost();
    }
}
