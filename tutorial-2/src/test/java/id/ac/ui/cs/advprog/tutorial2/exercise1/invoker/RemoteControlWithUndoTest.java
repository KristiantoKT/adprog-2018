package id.ac.ui.cs.advprog.tutorial2.exercise1.invoker;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import id.ac.ui.cs.advprog.tutorial2.exercise1.command.Command;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A RemoteControlWithUndo object")
class RemoteControlWithUndoTest {

    private static final int DEFAULT_BUTTON = 0;

    private RemoteControlWithUndo remote;
    private Command command;

    @BeforeEach
    void setUp() {
        remote = new RemoteControlWithUndo();
        command = mock(Command.class);
        remote.setCommand(DEFAULT_BUTTON, command, command);
    }

    @Test
    @DisplayName("tells device to switch on when on button was pressed")
    void testPressOnButton() {
        remote.onButtonWasPushed(DEFAULT_BUTTON);

        verify(command).execute();
    }

    @Test
    @DisplayName("tells device to switch off when off button was pressed")
    void testPressOffButton() {
        remote.offButtonWasPushed(DEFAULT_BUTTON);

        verify(command).execute();
    }

    @Test
    @DisplayName("tells device to undo previous operation when undo button was pressed")
    void testPressUndoButton() {
        remote.onButtonWasPushed(DEFAULT_BUTTON);
        remote.undoButtonWasPushed();

        verify(command).undo();
    }
}
