package id.ac.ui.cs.advprog.tutorial3.composite.higherups;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CtoTest {
    private Cto cto;

    @Before
    public void setUp() {
        cto = new Cto("Brook", 200000.00);
    }

    @Test
    public void testMethodGetSalary() {
        assertEquals(200000.00, cto.getSalary(), 0.00);
    }

    @Test
    public void testMethodGetName() {
        assertEquals("Brook", cto.getName());
    }

    @Test
    public void testMethodGetRole() {
        assertEquals("CTO", cto.getRole());
    }
}
