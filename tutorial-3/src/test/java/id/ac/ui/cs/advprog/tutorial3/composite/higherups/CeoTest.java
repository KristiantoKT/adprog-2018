package id.ac.ui.cs.advprog.tutorial3.composite.higherups;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CeoTest {
    private Ceo ceo;

    @Before
    public void setUp() {
        ceo = new Ceo("Brook", 200000.00);
    }

    @Test
    public void testMethodCost() {
        assertEquals(200000.00, ceo.getSalary(), 0.00);
    }

    @Test
    public void testMethodGetName() {
        assertEquals("Brook", ceo.getName());
    }

    @Test
    public void testMethodGetRole() {
        assertEquals("CEO", ceo.getRole());
    }
}
