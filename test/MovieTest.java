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

    @Test
    public void chargeAmountRegular() {
        movie.setPriceCode(Movie.REGULAR);
        double actual = movie.getCharge(RentalTest.DAYS_RENTED);
        assertEquals(5d, actual, 0);
    }

    @Test
    public void chargeAmountChildren() {
        movie.setPriceCode(Movie.CHILDRENS);
        double actual = movie.getCharge(RentalTest.DAYS_RENTED);
        assertEquals(3d, actual, 0);
    }

    @Test
    public void chargeAmountNewRelease() {
        movie.setPriceCode(Movie.NEW_RELEASE);
        double actual = movie.getCharge(RentalTest.DAYS_RENTED);
        assertEquals(12d, actual, 0);
    }

    @Test
    public void getFrequentRenterPointsOne() {
        movie.setPriceCode(Movie.NEW_RELEASE);
        int actual = movie.getFrequentRenterPoints(RentalTest.DAYS_RENTED_ONE);
        assertEquals(1, actual);
    }

    @Test
    public void getFrequentRenterPointsTwo() {
        movie.setPriceCode(Movie.NEW_RELEASE);
        int actual = movie.getFrequentRenterPoints(RentalTest.DAYS_RENTED);
        assertEquals(2, actual);
    }


}
