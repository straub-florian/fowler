import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    public static final String MOVIE_TITLE = "Terminator 2 - Judgement Day";

    private Movie movie;

    @Before
    public void setUp(){
        movie = new Movie(MOVIE_TITLE, Movie.REGULAR);
    }

    @Test
    public void getPriceCode() {
        assertEquals(movie.getPriceCode(), Movie.REGULAR);
    }

    @Test
    public void setPriceCode() {
        movie.setPriceCode(Movie.CHILDRENS);
        assertEquals(movie.getPriceCode(), Movie.CHILDRENS);
    }

    @Test
    public void getTitle() {
        assertEquals(movie.getTitle(), MOVIE_TITLE);
    }

}
