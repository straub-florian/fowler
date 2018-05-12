package de.fstraub.refactoring.fowler;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {

    public static final int DAYS_RENTED_ONE = 1;
    public static final int DAYS_RENTED = 4;

    private Movie movie;
    private Rental rental;

    @Before
    public void setUp(){
        movie  = new Movie(MovieTest.MOVIE_TITLE, Movie.REGULAR);
        rental = new Rental(movie, DAYS_RENTED);
    }

    @Test
    public void getMovie() {
        assertEquals(rental.getMovie(), movie);
    }

    @Test
    public void getDaysRented() {
        assertEquals(rental.getDaysRented(), DAYS_RENTED);
    }

}
