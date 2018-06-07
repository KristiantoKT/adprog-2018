package id.ac.ui.cs.advprog.tutorial2.exercise1.receiver;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A CeilingFan object")
class CeilingFanTest {

    private CeilingFan fan;

    @BeforeEach
    void setUp() {
        fan = new CeilingFan("Test Location");
    }

    @Test
    @DisplayName("can switch speed")
    void testSpeedChangesAsIntended() {
        assertAll("speed",
            () -> {
                fan.high();
                assertEquals(CeilingFan.HIGH, fan.getSpeed());
            },
            () -> {
                fan.medium();
                assertEquals(CeilingFan.MEDIUM, fan.getSpeed());
            },
            () -> {
                fan.low();
                assertEquals(CeilingFan.LOW, fan.getSpeed());
            },
            () -> {
                fan.off();
                assertEquals(CeilingFan.OFF, fan.getSpeed());
            }
        );
    }

    @Test
    @DisplayName("knows its location")
    void testGetLocation() {
        assertEquals("Test Location", fan.getLocation());
    }
}