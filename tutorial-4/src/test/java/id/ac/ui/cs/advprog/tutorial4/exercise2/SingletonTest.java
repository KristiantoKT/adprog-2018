package id.ac.ui.cs.advprog.tutorial4.exercise2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SingletonTest {

    private Class<?> singletonClass;

    @Before
    public void setUp() throws Exception {
        singletonClass = Class.forName(Singleton.class.getName());
    }

    @Test
    public void testNoPublicConstructors() {
        List<Constructor> constructors = Arrays.asList(singletonClass.getDeclaredConstructors());

        boolean check = constructors.stream()
                .anyMatch(c -> !Modifier.isPrivate(c.getModifiers()));

        assertFalse("Singleton should not have a public constructor!", check);
    }

    @Test
    public void testGetInstanceShouldReturnSingletonInstance() {
        Singleton instance = Singleton.getInstance();

        assertNotNull(instance);
    }
}