package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import static org.junit.Assert.assertEquals;

import id.ac.ui.cs.advprog.tutorial3.decorator.bread.CrustySandwich;
import org.junit.Before;
import org.junit.Test;

public class CucumberTest {
    private Cucumber crustyCucumberSanwich;

    @Before
    public void setUp() {
        crustyCucumberSanwich = new Cucumber(new CrustySandwich());
    }

    @Test
    public void testMethodCost() {
        assertEquals(1.40, crustyCucumberSanwich.cost(), 0.00);
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Crusty Sandwich, adding cucumber", crustyCucumberSanwich.getDescription());
    }
}
