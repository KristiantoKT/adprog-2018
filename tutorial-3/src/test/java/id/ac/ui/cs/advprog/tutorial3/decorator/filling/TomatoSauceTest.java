package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TomatoSauceTest {
    private TomatoSauce thinBunTomatoSauceBurger;

    @Before
    public void setUp() {
        thinBunTomatoSauceBurger = new TomatoSauce(new ThinBunBurger());
    }

    @Test
    public void testMethodCost() {
        assertEquals(1.70, thinBunTomatoSauceBurger.cost(), 0.00);
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Thin Bun Burger, adding tomato sauce",
                thinBunTomatoSauceBurger.getDescription());
    }
}
