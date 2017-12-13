package org.pltw.examples.makingclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Arithmetic testArithmetic = new Arithmetic();
        TaxArithmetic testTaxArithmetic = new TaxArithmetic();

        System.out.println(testArithmetic);
        System.out.println(testTaxArithmetic);

        System.out.println(testTaxArithmetic.calculateTax(10.75, 8.5));
        System.out.println(testTaxArithmetic.add());
    }
}
