import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    // TODO: Remove redundancy in setting up test fixture in each test methods
    // Hint: Make the test fixture into an instance variable

    @Test
    public void getTitle() {
        Movie movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);

        assertEquals("Who Killed Captain Alex?", movie.getTitle());
    }

    @Test
    public void setTitle() {
        Movie movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);

        movie.setTitle("Bad Black");

        assertEquals("Bad Black", movie.getTitle());
    }

    @Test
    public void getPriceCode() {
        Movie movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);

        assertEquals(Movie.REGULAR, movie.getPriceCode());
    }

    @Test
    public void setPriceCode() {
        Movie movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);

        movie.setPriceCode(Movie.CHILDREN);

        assertEquals(Movie.CHILDREN, movie.getPriceCode());
    }
}