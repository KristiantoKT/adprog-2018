package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public enum FillingDecorator {
    BEEF_MEAT,
    CHEESE,
    CHICKEN_MEAT,
    CHILI_SAUCE,
    CUCUMBER,
    LETTUCE,
    TOMATO,
    TOMATO_SAUCE;

    /**
     * This function will decorate Food Object with a Filling Object.
     * @param bread bread that want to be filled
     * @return bread that had been filled
     */
    public Food addFillingToBread(Food bread) {
        switch (this) {
            case BEEF_MEAT:
                bread = new BeefMeat(bread);
                break;
            case CHEESE:
                bread = new Cheese(bread);
                break;
            case CHICKEN_MEAT:
                bread = new ChickenMeat(bread);
                break;
            case CHILI_SAUCE:
                bread = new ChiliSauce(bread);
                break;
            case CUCUMBER:
                bread = new Cucumber(bread);
                break;
            case LETTUCE:
                bread = new Lettuce(bread);
                break;
            case TOMATO:
                bread = new Tomato(bread);
                break;
            case TOMATO_SAUCE:
                bread = new TomatoSauce(bread);
                break;
            default:
                bread = new ChickenMeat(bread);
                break;
        }
        return bread;
    }
}
