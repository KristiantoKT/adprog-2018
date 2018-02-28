package id.ac.ui.cs.advprog.tutorial3.decorator.bread;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CrustySandwichTest {
    private CrustySandwich crustySandwich;

    @Before
    public void setUp() {
        crustySandwich = new CrustySandwich();
    }

    @Test
    public void testMethodCost() {
        assertEquals(1.00, crustySandwich.cost(), 0.00);
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Crusty Sandwich", crustySandwich.getDescription());
    }
}
