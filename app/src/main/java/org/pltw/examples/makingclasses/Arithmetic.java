package org.pltw.examples.makingclasses;

/**
 * Created by 20hunbra on 12/13/2017.
 */

public class Arithmetic {

    private int mOperand1;
    private int mOperand2;

    //Constructors
    public Arithmetic(){
        mOperand1 = 2;
        mOperand2 = 3;
    }

    public Arithmetic (int mOperand1, int mOperand2) {
        this.mOperand1 = mOperand1;
        this.mOperand2 = mOperand2;
    }

    //toString method
    public String toString() {
        return "Arithmetic Instance:  mOperand1 = " + mOperand1 + "; mOperand2 = " + mOperand2 + ".";
    }

    //Simple methods
    public int add() {
        return mOperand1 + mOperand2;
    }

    public int subtract() {
        return mOperand1 - mOperand2;
    }

    public int multiply() {
        return mOperand1 * mOperand2;
    }

    public double divide() {
        return mOperand1 / mOperand2;
    }


    //Static methods
    public static int add(int operand1, int operand2){
        return operand1 + operand2;
    }

    public static int subtract(int operand1, int operand2){
        return operand1 - operand2;
    }

    public static int multiply(int operand1, int operand2){
        return operand1 * operand2;
    }

    public static double divide(int operand1, int operand2){
        return operand1 / operand2;
    }

}
