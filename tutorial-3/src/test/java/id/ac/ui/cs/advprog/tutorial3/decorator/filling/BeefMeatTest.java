package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import static org.junit.Assert.assertEquals;

import id.ac.ui.cs.advprog.tutorial3.decorator.bread.CrustySandwich;
import org.junit.Before;
import org.junit.Test;

public class BeefMeatTest {

    private BeefMeat crustyBeefMeatSanwich;

    @Before
    public void setUp() {
        crustyBeefMeatSanwich = new BeefMeat(new CrustySandwich());
    }

    @Test
    public void testMethodCost() {
        assertEquals(7.00, crustyBeefMeatSanwich.cost(), 0.00);
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Crusty Sandwich, adding beef meat",
                crustyBeefMeatSanwich.getDescription());
    }
}
