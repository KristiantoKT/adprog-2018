package id.ac.ui.cs.advprog.tutorial2.exercise1.command;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import id.ac.ui.cs.advprog.tutorial2.exercise1.receiver.Light;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("A LightOffCommand object")
class LightOffCommandTest {

    private Command command;
    private Light light;

    @BeforeEach
    void setUp() {
        light = mock(Light.class);
        command = new LightOffCommand(light);
    }

    @Test
    @DisplayName("switches off Light when execute() was called")
    void execute() {
        command.execute();

        verify(light).off();
    }

    @Test
    @DisplayName("switches on Light when undo() was called")
    void undo() {
        command.undo();

        verify(light).on();
    }
}