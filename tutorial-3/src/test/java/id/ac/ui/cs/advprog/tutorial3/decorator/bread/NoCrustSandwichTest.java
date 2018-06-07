package id.ac.ui.cs.advprog.tutorial3.decorator.bread;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NoCrustSandwichTest {
    private NoCrustSandwich noCrustSandwich;

    @Before
    public void setUp() {
        noCrustSandwich = new NoCrustSandwich();
    }

    @Test
    public void testMethodCost() {
        assertEquals(2.00, noCrustSandwich.cost(), 0.00);
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("No Crust Sandwich", noCrustSandwich.getDescription());
    }
}
