import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    // TODO: Remove redundancy in setting up test fixture in each test methods
    // Hint: Make the test fixture into an instance variable

    @Test
    public void getMovie() {
        Movie movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);
        Rental rent = new Rental(movie, 3);

        assertEquals(movie, rent.getMovie());
    }

    @Test
    public void getDaysRented() {
        Movie movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);
        Rental rent = new Rental(movie, 3);

        assertEquals(3, rent.getDaysRented());
    }
}