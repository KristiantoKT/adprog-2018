package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class ChiliSauce extends Food {
    Food food;

    public ChiliSauce(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", adding chili sauce";
    }

    @Override
    public double cost() {
        return .3 + food.cost();
    }
}
