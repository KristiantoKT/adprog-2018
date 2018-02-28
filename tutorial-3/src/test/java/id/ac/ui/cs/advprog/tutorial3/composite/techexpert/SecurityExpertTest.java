package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SecurityExpertTest {
    private SecurityExpert securityExpert;

    @Before
    public void setUp() {
        securityExpert = new SecurityExpert("Brook", 200000.00);
    }

    @Test
    public void testMethodCost() {
        assertEquals(200000.00, securityExpert.getSalary(), 0.00);
    }

    @Test
    public void testMethodGetName() {
        assertEquals("Brook", securityExpert.getName());
    }

    @Test
    public void testMethodGetRole() {
        assertEquals("Security Expert", securityExpert.getRole());
    }
}
