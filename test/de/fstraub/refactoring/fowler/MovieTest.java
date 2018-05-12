package de.fstraub.refactoring.fowler;

import de.fstraub.refactoring.fowler.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    public static final String MOVIE_TITLE = "Terminator 2 - Judgement Day";

    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie(MOVIE_TITLE, Movie.REGULAR);
    }

    @Test
    public void getPriceCode() {
        movie.setPriceCode(Movie.REGULAR);
        assertEquals(movie.getPriceCode(), Movie.REGULAR);
    }

    @Test
    public void setPriceCodeChildren() {
        movie.setPriceCode(Movie.CHILDREN);
        assertEquals(movie.getPriceCode(), Movie.CHILDREN);
    }

    @Test
    public void setPriceCodeNewRelease() {
        movie.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(movie.getPriceCode(), Movie.NEW_RELEASE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPriceCodeIllegalArgument() {
        movie.setPriceCode(-1);
    }

    @Test
    public void getTitle() {
        assertEquals(movie.getTitle(), MOVIE_TITLE);
    }

}
