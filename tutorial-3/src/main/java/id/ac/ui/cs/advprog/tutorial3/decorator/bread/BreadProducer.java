package id.ac.ui.cs.advprog.tutorial3.decorator.bread;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public enum BreadProducer {
    THIN_BUN,
    THICK_BUN,
    CRUSTY_SANDWICH,
    NO_CRUST_SANDWICH;

    /**
     * This method will create a Food object that represent a bread that want to be created.
     * @return Food that represent bread type, deafult is Thin Bun
     */
    public Food createBreadToBeFilled() {
        Food returnedFood = null;
        switch (this) {
            case THIN_BUN:
                returnedFood = new ThinBunBurger();
                break;
            case THICK_BUN:
                returnedFood = new ThickBunBurger();
                break;
            case CRUSTY_SANDWICH:
                returnedFood = new CrustySandwich();
                break;
            case NO_CRUST_SANDWICH:
                returnedFood = new NoCrustSandwich();
                break;
            default:
                returnedFood = new ThinBunBurger();
                break;
        }
        return returnedFood;
    }
}
