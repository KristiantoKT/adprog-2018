import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    // TODO: Remove redundancy in setting up test fixture in each test methods
    // Hint: Make the test fixture into an instance variable

    @Test
    public void getName() {
        Customer customer = new Customer("Alice");

        assertEquals("Alice", customer.getName());
    }

    @Test
    public void statementWithSingleMovie() {
        Movie movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);
        Rental rent = new Rental(movie, 3);
        Customer customer = new Customer("Alice");
        customer.addRental(rent);

        String result = customer.statement();
        String[] lines = result.split("\n");

        assertEquals(4, lines.length);
        assertTrue(result.contains("Amount owed is 3.5"));
        assertTrue(result.contains("1 frequent renter points"));
    }

    // TODO Implement me!
    public void statementWithMultipleMovies() {
        // TODO Implement me!
    }
}