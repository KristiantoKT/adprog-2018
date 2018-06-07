package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UiUxDesignerTest {
    private UiUxDesigner uiUxDesigner;

    @Before
    public void setUp() {
        uiUxDesigner = new UiUxDesigner("Brook", 200000.00);
    }

    @Test
    public void testMethodCost() {
        assertEquals(200000.00, uiUxDesigner.getSalary(), 0.00);
    }

    @Test
    public void testMethodGetName() {
        assertEquals("Brook", uiUxDesigner.getName());
    }

    @Test
    public void testMethodGetRole() {
        assertEquals("UI/UX Designer", uiUxDesigner.getRole());
    }
}
