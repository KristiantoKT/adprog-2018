package id.ac.ui.cs.advprog.tutorial3.decorator.bread;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class ThickBunBurger extends Food {
    public ThickBunBurger() {
        description = "Thick Bun Burger";

    }

    @Override
    public double cost() {
        return 2.5;
    }
}
