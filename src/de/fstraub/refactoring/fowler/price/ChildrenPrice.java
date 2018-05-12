package de.fstraub.refactoring.fowler.price;

import de.fstraub.refactoring.fowler.Movie;

public class ChildrenPrice extends Price {

    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
