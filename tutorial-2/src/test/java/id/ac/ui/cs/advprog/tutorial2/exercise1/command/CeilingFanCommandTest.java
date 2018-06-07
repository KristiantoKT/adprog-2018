package id.ac.ui.cs.advprog.tutorial2.exercise1.command;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import id.ac.ui.cs.advprog.tutorial2.exercise1.receiver.CeilingFan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("A CeilingFanCommand object")
class CeilingFanCommandTest {

    private CeilingFanCommand command;
    private CeilingFan fan;

    @BeforeEach
    void setUp() {
        fan = mock(CeilingFan.class);
        command = new CeilingFanCommand(fan) {

            @Override
            protected void operate() {
                this.ceilingFan.high();
            }
        };
    }

    @Test
    @DisplayName("gets previous speed when execute() was called")
    void testExecuteGetsPreviousSpeed() {
        command.execute();

        verify(fan).getSpeed();
    }

    @Test
    @DisplayName("uses operate() abstract method to delegate actual operations "
            + "when execute() was called")
    void testExecuteCallsOperate() {
        CeilingFanCommand partialMockCommand = spy(command);
        partialMockCommand.execute();

        verify(partialMockCommand).operate();
    }

    @Test
    @DisplayName("can undo fan's speed to its previous state")
    void testUndoFunctionality() {
        when(fan.getSpeed()).thenReturn(CeilingFan.OFF);

        command.execute();
        verify(fan).high();

        command.undo();
        verify(fan).off();
    }
}