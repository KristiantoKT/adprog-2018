package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LettuceTest {
    private Lettuce noCrustLettuceSandwich;

    @Before
    public void setUp() {
        noCrustLettuceSandwich = new Lettuce(new NoCrustSandwich());
    }

    @Test
    public void testMethodCost() {
        assertEquals(2.75, noCrustLettuceSandwich.cost(), 0.00);
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("No Crust Sandwich, adding lettuce", noCrustLettuceSandwich.getDescription());
    }
}
