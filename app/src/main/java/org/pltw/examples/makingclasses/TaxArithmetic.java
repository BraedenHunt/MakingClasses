package org.pltw.examples.makingclasses;

/**
 * Created by 20hunbra on 12/13/2017.
 */

public class TaxArithmetic extends Arithmetic {

    public double calculateTax(double price, double tax) {
        return price*tax*.01;
    }

    public double calculateTax(double tax) {
        int price = add();
        return price*tax*.01;
    }
}
