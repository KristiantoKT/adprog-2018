package id.ac.ui.cs.advprog.tutorial3.decorator.bread;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class NoCrustSandwich extends Food {
    public NoCrustSandwich() {
        description = "No Crust Sandwich";

    }

    @Override
    public double cost() {
        return 2.0;
    }
}
