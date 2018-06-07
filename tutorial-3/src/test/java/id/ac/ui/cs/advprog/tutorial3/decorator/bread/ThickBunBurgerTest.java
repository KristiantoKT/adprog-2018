package id.ac.ui.cs.advprog.tutorial3.decorator.bread;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ThickBunBurgerTest {
    private ThickBunBurger thickBunBurger;

    @Before
    public void setUp() {
        thickBunBurger = new ThickBunBurger();
    }

    @Test
    public void testMethodCost() {
        assertEquals(2.50, thickBunBurger.cost(), 0.00);
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Thick Bun Burger", thickBunBurger.getDescription());
    }
}
