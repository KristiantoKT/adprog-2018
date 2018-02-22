package id.ac.ui.cs.advprog.tutorial2.exercise1.command;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

import java.lang.reflect.Constructor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

@DisplayName("A MacroCommand object")
class MacroCommandTest {

    @Test
    @DisplayName("accepts an array of Command object(s)")
    void testAcceptArrayOfCommands() throws Exception {
        Class<?> macroCommandClass = Class.forName(
                "id.ac.ui.cs.advprog.tutorial2.exercise1.command.MacroCommand");
        Constructor<?> constructor = macroCommandClass.getDeclaredConstructor(Command[].class);
    }

    @Test
    @DisplayName("executes Command objects sequentially")
    void testExecuteCommandsSequentially() {
        Command mock1 = mock(Command.class);
        Command mock2 = mock(Command.class);
        Command mock3 = mock(Command.class);
        InOrder inOrder = inOrder(mock1, mock2, mock3);

        Command[] commands = { mock1, mock2, mock3 };
        Command macro = new MacroCommand(commands);
        macro.execute();

        inOrder.verify(mock1).execute();
        inOrder.verify(mock2).execute();
        inOrder.verify(mock3).execute();
    }

    @Test
    @DisplayName("undoes Command objects backwardly")
    void testUndoCommandsBackwardly() {
        Command mock1 = mock(Command.class);
        Command mock2 = mock(Command.class);
        Command mock3 = mock(Command.class);
        InOrder inOrder = inOrder(mock1, mock2, mock3);

        Command[] commands = { mock1, mock2, mock3 };
        Command macro = new MacroCommand(commands);
        macro.undo();

        inOrder.verify(mock3).undo();
        inOrder.verify(mock2).undo();
        inOrder.verify(mock1).undo();
    }
}