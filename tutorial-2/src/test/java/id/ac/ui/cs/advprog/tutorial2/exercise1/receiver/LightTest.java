package id.ac.ui.cs.advprog.tutorial2.exercise1.receiver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A Light object")
class LightTest {

    private Light light;

    @BeforeEach
    void setUp() {
        light = new Light("Test Location");
    }

    @Test
    @DisplayName("can turn on light")
    void testOnTurnsOnLight() {
        light.on();

        assertTrue(light.isLit());
    }

    @Test
    @DisplayName("can turn off light")
    void testOffTurnsOffLight() {
        light.off();

        assertFalse(light.isLit());
    }

    @Test
    @DisplayName("knows its location")
    void testLocation() {
        assertEquals("Test Location", light.getLocation());
    }

    @Test
    @DisplayName("initially off")
    void testIsLit() {
        assertFalse(light.isLit());
    }
}