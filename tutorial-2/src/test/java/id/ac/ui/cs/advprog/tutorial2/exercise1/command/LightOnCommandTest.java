package id.ac.ui.cs.advprog.tutorial2.exercise1.command;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import id.ac.ui.cs.advprog.tutorial2.exercise1.receiver.Light;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A LightOnCommand object")
class LightOnCommandTest {

    private Light light;
    private Command command;

    @BeforeEach
    void setUp() {
        light = mock(Light.class);
        command = new LightOnCommand(light);
    }

    @Test
    @DisplayName("switches on Light when execute() was called")
    void testExecuteSwitchOnLight() {
        command.execute();

        verify(light).on();
        verify(light, never()).off();
    }

    @Test
    @DisplayName("switches off Light when undo() was called")
    void testUndoSwitchOffLight() {
        command.undo();

        verify(light).off();
        verify(light, never()).on();
    }
}