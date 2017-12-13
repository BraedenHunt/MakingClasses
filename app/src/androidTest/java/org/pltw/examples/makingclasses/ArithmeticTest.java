package org.pltw.examples.makingclasses;

import junit.framework.TestCase;

/**
 * Created by 20hunbra on 12/13/2017.
 */

public class ArithmeticTest extends TestCase {

    Arithmetic a;

    @Override
    public void setUp()throws Exception{
        super.setUp();
    }

    public void testArithmeticAdd() {
        assertEquals(Arithmetic.add(12,13), 25);
    }

    public void testArithmeticSubtract() {
        assertEquals(Arithmetic.subtract(1, 2), -1);
    }

    public void testArithmeticMultiply() {
        assertEquals(Arithmetic.multiply(2, 3), 6);
    }

    public void testArithmeticDivide() {
        assertEquals(Arithmetic.divide(2, 3), 2/3);
    }


    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }
}
