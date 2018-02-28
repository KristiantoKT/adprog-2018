package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TomatoTest {
    private Tomato thickBunTomatoBurger;

    @Before
    public void setUp() {
        thickBunTomatoBurger = new Tomato(new ThickBunBurger());
    }

    @Test
    public void testMethodCost() {
        assertEquals(3.00, thickBunTomatoBurger.cost(), 0.00);
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Thick Bun Burger, adding tomato", thickBunTomatoBurger.getDescription());
    }
}
