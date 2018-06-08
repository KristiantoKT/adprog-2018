import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class CustomerTest {
    private Customer customer;
    private Movie movie;
    private Rental rent;

    @Before
    public void setUp() {
        customer = new Customer("Alice");
        movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);
        rent = new Rental(movie, 3);
    }


    @Test
    public void getName() {
        assertEquals("Alice", customer.getName());
    }

    @Test
    public void statementWithSingleRegularMovie() {
        customer.addRental(rent);

        String result = customer.statement();
        String[] lines = result.split("\n");

        assertEquals(4, lines.length);
        assertTrue(result.contains("Amount owed is 3.5"));
        assertTrue(result.contains("1 frequent renter points"));
    }

    @Test
    public void htmlStatementWithSingleRegularMovie() {
        customer.addRental(rent);

        String result = customer.htmlStatement();
        String[] lines = result.split("\n");

        assertEquals(4, lines.length);
        assertTrue(result.contains("<P>You owe <EM> 3.5"));
        assertTrue(result.contains("On this rental you earned 1"));
    }

    @Test
    public void statementWithSingleNewReleaseMovie() {
        movie.setPriceCode(Movie.NEW_RELEASE);
        customer.addRental(rent);

        String result = customer.statement();
        String[] lines = result.split("\n");

        assertEquals(4, lines.length);
        assertTrue(result.contains("Amount owed is 9.0"));
        assertTrue(result.contains("2 frequent renter points"));
    }

    @Test
    public void statementWithSingleChildrenMovieRentedBelow3Days() {
        movie.setPriceCode(Movie.CHILDREN);
        customer.addRental(rent);

        String result = customer.statement();
        String[] lines = result.split("\n");

        assertEquals(4, lines.length);
        assertTrue(result.contains("Amount owed is 1.5"));
        assertTrue(result.contains("1 frequent renter points"));
    }

    @Test
    public void statementWithSingleChildrenMovieRentedAbove3Days() {
        movie.setPriceCode(Movie.CHILDREN);
        Rental rent2 = new Rental(movie, 4);
        customer.addRental(rent2);

        String result = customer.statement();
        String[] lines = result.split("\n");

        System.out.println(result);
        assertEquals(4, lines.length);
        assertTrue(result.contains("Amount owed is 3.0"));
        assertTrue(result.contains("1 frequent renter points"));
    }

    @Test
    public void statementWithMultipleMovies() {
        Movie movie2 = new Movie("Nobody Killed Captain Alex", Movie.NEW_RELEASE);
        Rental rent2 = new Rental(movie2, 2);
        customer.addRental(rent2);

        String result = customer.statement();
        String[] lines = result.split("\n");

        assertEquals(4, lines.length);
        assertTrue(result.contains("Amount owed is 6.0"));
        assertTrue(result.contains("2 frequent renter points"));
    }
}