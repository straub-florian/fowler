import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {

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

    @Test
    public void chargeAmountRegular(){
        movie.setPriceCode(Movie.REGULAR);
        double actual = rental.getCharge();
        assertEquals(5d, actual, 0);
    }

    @Test
    public void chargeAmountChildren(){
        movie.setPriceCode(Movie.CHILDRENS);
        double actual = rental.getCharge();
        assertEquals(3d, actual, 0);
    }

    @Test
    public void chargeAmountNewRelease(){
        movie.setPriceCode(Movie.NEW_RELEASE);
        double actual = rental.getCharge();
        assertEquals(12d, actual, 0);
    }


}
