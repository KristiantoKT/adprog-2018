package id.ac.ui.cs.advprog.tutorial2.exercise1.command;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A Command interface")
class CommandTest {

    private Class<?> commandClass;

    @BeforeEach
    void setUp() throws Exception {
        commandClass = Class.forName(Command.class.getName());
    }

    @Test
    @DisplayName("is an interface")
    void testTypeIsInterface() {
        int classModifiers = commandClass.getModifiers();

        assertTrue(Modifier.isInterface(classModifiers));
    }

    @Test
    @DisplayName("has execute() method")
    void testExecute() throws Exception {
        Method execute = commandClass.getDeclaredMethod("execute");
        Type retType = execute.getGenericReturnType();
        int methodModifiers = execute.getModifiers();

        assertTrue(Modifier.isAbstract(methodModifiers));
        assertEquals("void", retType.getTypeName());
    }

    @Test
    @DisplayName("has undo() method")
    void undo() throws Exception {
        Method undo = commandClass.getDeclaredMethod("undo");
        Type retType = undo.getGenericReturnType();
        int methodModifiers = undo.getModifiers();

        assertTrue(Modifier.isAbstract(methodModifiers));
        assertEquals("void", retType.getTypeName());
    }
}