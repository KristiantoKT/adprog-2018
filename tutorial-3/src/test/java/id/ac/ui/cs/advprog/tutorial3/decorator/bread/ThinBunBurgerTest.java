package id.ac.ui.cs.advprog.tutorial3.decorator.bread;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ThinBunBurgerTest {
    private ThinBunBurger thinBunBurger;

    @Before
    public void setUp() {
        thinBunBurger = new ThinBunBurger();
    }

    @Test
    public void testMethodCost() {
        assertEquals(1.50, thinBunBurger.cost(), 0.00);
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Thin Bun Burger", thinBunBurger.getDescription());
    }
}
