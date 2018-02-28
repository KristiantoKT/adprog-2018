package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ChiliSauceTest {
    private ChiliSauce thickBunChiliSauceBurger;

    @Before
    public void setUp() {
        thickBunChiliSauceBurger = new ChiliSauce(new ThickBunBurger());
    }

    @Test
    public void testMethodCost() {
        assertEquals(2.80, thickBunChiliSauceBurger.cost(), 0.00);
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Thick Bun Burger, adding chili sauce",
                thickBunChiliSauceBurger.getDescription());
    }
}
