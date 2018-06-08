import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class MovieTest {
    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);
    }

    @Test
    public void getTitle() {
        assertEquals("Who Killed Captain Alex?", movie.getTitle());
    }

    @Test
    public void setTitle() {
        movie.setTitle("Bad Black");

        assertEquals("Bad Black", movie.getTitle());
    }

    @Test
    public void getPriceCode() {
        assertEquals(Movie.REGULAR, movie.getPriceCode());
    }

    @Test
    public void setPriceCode() {
        movie.setPriceCode(Movie.CHILDREN);

        assertEquals(Movie.CHILDREN, movie.getPriceCode());
    }

    @Test
    public void checkHashCode() {
        assertNotNull(movie.hashCode());
    }

    @Test
    public void checkEquals() {
        Movie movie1 = null;
        assertTrue(!(movie.equals(movie1)));

        movie1 = new Movie("Who Killed Captain Alex?", Movie.REGULAR);
        assertTrue(movie.equals(movie1));
    }
}