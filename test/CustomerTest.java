import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    private final String name = "Harald Klimbones";

    private Movie movie;
    private Rental rental;
    private Customer customer;

    @Before
    public void setUp(){
        movie = new Movie(MovieTest.MOVIE_TITLE, Movie.REGULAR);
        rental = new Rental(movie, RentalTest.DAYS_RENTED);
        customer = new Customer(name);
        customer.addRental(rental);
    }

    @Test
    public void getName(){
        assertEquals(name, customer.getName());
    }

    @Test
    public void statement(){
        String expected = "Rental Record for "+name+"\n" +
        "\tTitle\t\tDays\tAmount\n" +
                "\t"+movie.getTitle()+"\t\t"+rental.getDaysRented()+"\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";

        String actual = customer.statement();
        assertEquals(expected, actual);
    }

}
