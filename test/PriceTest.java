import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceTest {

    private Price price;

    @Test
    public void chargeAmountRegular() {
        price = new RegularPrice();
        double actual = price.getCharge(RentalTest.DAYS_RENTED);
        assertEquals(5d, actual, 0);
    }

    @Test
    public void chargeAmountChildren() {
        price = new ChildrensPrice();
        double actual = price.getCharge(RentalTest.DAYS_RENTED);
        assertEquals(3d, actual, 0);
    }

    @Test
    public void chargeAmountNewRelease() {
        price = new NewReleasePrice();
        double actual = price.getCharge(RentalTest.DAYS_RENTED);
        assertEquals(12d, actual, 0);
    }

    @Test
    public void getFrequentRenterPointsDefault() {
        price = new RegularPrice();
        int actual = price.getFrequentRenterPoints(RentalTest.DAYS_RENTED_ONE);
        assertEquals(1, actual);
    }

    @Test
    public void getFrequentRenterPointsNewReleaseOne() {
        price = new NewReleasePrice();
        int actual = price.getFrequentRenterPoints(RentalTest.DAYS_RENTED_ONE);
        assertEquals(1, actual);
    }

    @Test
    public void getFrequentRenterPointsNewReleaseTwo() {
        price = new NewReleasePrice();
        int actual = price.getFrequentRenterPoints(RentalTest.DAYS_RENTED);
        assertEquals(2, actual);
    }

}
