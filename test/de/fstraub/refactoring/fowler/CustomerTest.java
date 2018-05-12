package de.fstraub.refactoring.fowler;

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
        movie = new Movie(MovieTest.MOVIE_TITLE, Movie.NEW_RELEASE);
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
        String expected = "de.fstraub.refactoring.fowler.Rental Record for "+name+"\n" +
        "\tTitle\tDays\tAmount\n" +
                "\t"+movie.getTitle()+"\t"+rental.getDaysRented()+"\t12.0\n" +
                "Amount owed is 12.0\n" +
                "You earned 2 frequent renter points";

        String actual = customer.statement();
        assertEquals(expected, actual);
    }

}
