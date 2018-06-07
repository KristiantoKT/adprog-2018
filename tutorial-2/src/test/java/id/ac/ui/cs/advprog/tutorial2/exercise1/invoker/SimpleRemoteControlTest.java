package id.ac.ui.cs.advprog.tutorial2.exercise1.invoker;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import id.ac.ui.cs.advprog.tutorial2.exercise1.command.Command;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("A SimpleRemoteControl object")
class SimpleRemoteControlTest {

    private SimpleRemoteControl remote;
    private Command command;

    @BeforeEach
    void setUp() {
        remote = new SimpleRemoteControl();
        command = mock(Command.class);
    }

    @Test
    @DisplayName("should execute command when button was pressed")
    void testPressButton() {
        remote.setCommand(command);
        remote.buttonWasPressed();

        verify(command).execute();
    }
}