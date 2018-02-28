package id.ac.ui.cs.advprog.tutorial3.decorator;

import static org.junit.Assert.assertEquals;

import id.ac.ui.cs.advprog.tutorial3.decorator.bread.BreadProducer;
import id.ac.ui.cs.advprog.tutorial3.decorator.filling.FillingDecorator;
import org.junit.Before;
import org.junit.Test;

public class MultipleFillingTest {

    private Food thickBunBurgerSpecial;
    private Food thinBunBurgerVegetarian;
    private Food doubleBeefChickenDoubleSauceSandwich;
    private Food noCrustAllFillingSandwich;


    @Test
    public void testThickBunBurgerSpecialCost() {
        //Thick Bun Burger with Beef Meat, Cheese, Cucumber, Lettuce, and Chili Sauce
        thickBunBurgerSpecial = BreadProducer.THICK_BUN.createBreadToBeFilled();
        assertEquals(2.50, thickBunBurgerSpecial.cost(), 0.001);

        thickBunBurgerSpecial = FillingDecorator.BEEF_MEAT.addFillingToBread(
                thickBunBurgerSpecial);
        assertEquals(8.50, thickBunBurgerSpecial.cost(), 0.001);

        thickBunBurgerSpecial = FillingDecorator.CHEESE.addFillingToBread(
                thickBunBurgerSpecial);
        assertEquals(10.50, thickBunBurgerSpecial.cost(), 0.001);

        thickBunBurgerSpecial = FillingDecorator.CUCUMBER.addFillingToBread(
                thickBunBurgerSpecial);
        assertEquals(10.90, thickBunBurgerSpecial.cost(), 0.001);

        thickBunBurgerSpecial = FillingDecorator.LETTUCE.addFillingToBread(
                thickBunBurgerSpecial);
        assertEquals(11.65, thickBunBurgerSpecial.cost(), 0.001);

        thickBunBurgerSpecial = FillingDecorator.CHILI_SAUCE.addFillingToBread(
                thickBunBurgerSpecial);
        assertEquals(11.95, thickBunBurgerSpecial.cost(), 0.001);
    }

    @Test
    public void testThinBunBurgerVegetarianCost() {
        //Thin Bun Burger with Tomato, Lettuce, Cucumber
        thinBunBurgerVegetarian = BreadProducer.THIN_BUN.createBreadToBeFilled();
        assertEquals(1.50, thinBunBurgerVegetarian.cost(), 0.001);

        thinBunBurgerVegetarian = FillingDecorator.TOMATO.addFillingToBread(
                thinBunBurgerVegetarian);
        assertEquals(2.00, thinBunBurgerVegetarian.cost(), 0.001);

        thinBunBurgerVegetarian = FillingDecorator.LETTUCE.addFillingToBread(
                thinBunBurgerVegetarian);
        assertEquals(2.75, thinBunBurgerVegetarian.cost(), 0.001);

        thinBunBurgerVegetarian = FillingDecorator.CUCUMBER.addFillingToBread(
                thinBunBurgerVegetarian);
        assertEquals(3.15, thinBunBurgerVegetarian.cost(), 0.001);
    }

    @Test
    public void testDoubleBeefChickenDoubleSauceCrustySandwich() {

        //Crusty Sandiwich with Beef Meat, Chicken Meat, Using Tomato and Chili Sauce
        doubleBeefChickenDoubleSauceSandwich =
                BreadProducer.CRUSTY_SANDWICH.createBreadToBeFilled();
        assertEquals(1.00, doubleBeefChickenDoubleSauceSandwich.cost(), 0.001);

        doubleBeefChickenDoubleSauceSandwich =
                FillingDecorator.BEEF_MEAT.addFillingToBread(
                doubleBeefChickenDoubleSauceSandwich);
        assertEquals(7.00, doubleBeefChickenDoubleSauceSandwich.cost(), 0.001);

        doubleBeefChickenDoubleSauceSandwich =
                FillingDecorator.CHICKEN_MEAT.addFillingToBread(
                doubleBeefChickenDoubleSauceSandwich);
        assertEquals(11.50, doubleBeefChickenDoubleSauceSandwich.cost(), 0.001);

        doubleBeefChickenDoubleSauceSandwich =
                FillingDecorator.CHILI_SAUCE.addFillingToBread(
                doubleBeefChickenDoubleSauceSandwich);
        assertEquals(11.80, doubleBeefChickenDoubleSauceSandwich.cost(), 0.001);

        doubleBeefChickenDoubleSauceSandwich =
                FillingDecorator.TOMATO_SAUCE.addFillingToBread(
                        doubleBeefChickenDoubleSauceSandwich);
        assertEquals(12.00, doubleBeefChickenDoubleSauceSandwich.cost(), 0.001);
    }

    @Test
    public void testNoCrustAllFillingSandwich() {
        //No Crust Sandiwich with All Filling
        noCrustAllFillingSandwich = BreadProducer.NO_CRUST_SANDWICH
                .createBreadToBeFilled();

        noCrustAllFillingSandwich = FillingDecorator.BEEF_MEAT.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.CHEESE.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.CHICKEN_MEAT.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.CHILI_SAUCE.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.CUCUMBER.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.LETTUCE.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.TOMATO.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.TOMATO_SAUCE.addFillingToBread(
                noCrustAllFillingSandwich);
        assertEquals(16.65, noCrustAllFillingSandwich.cost(), 0.001);
    }
}
