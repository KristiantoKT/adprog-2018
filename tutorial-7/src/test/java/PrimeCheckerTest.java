import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class PrimeCheckerTest {

    private static final List<Integer> PRIME_NUMBERS = Arrays.asList(2, 3, 5, 7);

    @Ignore
    public void testIsPrimeTrueGivenPrimeNumbers() {
        PRIME_NUMBERS.forEach(number -> assertTrue(PrimeChecker.isPrime(number)));
    }

    @Ignore
    public void testIsPrimeFalseGivenNonPrimeNumbers() {
        fail("TODO Implement me!");
        // Given non-prime numbers
        // When isPrime is invoked
        // It should return false
    }
}