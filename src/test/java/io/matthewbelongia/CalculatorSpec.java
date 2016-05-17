package io.matthewbelongia;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by matthewb on 4/27/16.
 */
public class CalculatorSpec {

        @Test
        public void sumTest() {
            Calculator calculator = new Calculator();
            int expectedSum = 4;
            int actualSum = calculator.add(2, 2);
            assertEquals("The expected value should be 2", expectedSum, actualSum);
        }
        @Test
        public void multTest(){
            Calculator calculator = new Calculator();
            int expectedMult = 9;
            int actualMult = calculator.multiply(3,3);
            assertEquals("The expected value should be 9",expectedMult,actualMult);
        }
        @Test
        public void DivTest() {
            Calculator calculator = new Calculator();
            int expectedDiv = 3;
            int actualDiv =0;
            int catchException = -1;
            try {actualDiv = calculator.divide(9, 3);}catch (DivideByZeroException e){actualDiv = catchException;}
            assertEquals("The expected value should be 3", expectedDiv, actualDiv);

            try {actualDiv = calculator.divide(9, 0);}catch (DivideByZeroException e){actualDiv = catchException;}
            assertEquals("The expected value should be -1", catchException, actualDiv);
        }
        @Test
        public void DiffTest() {
            Calculator calculator = new Calculator();
            int expectedDiff = 6;
            int actualDiff = calculator.subtract(9, 3);
            assertEquals("The expected value should be 6", expectedDiff, actualDiff);
        }

        @Test
        public void squareRootTest() {
            Calculator calculator = new Calculator();
            double expectedDiv = 5;
            double actualDiv =0;
            double catchException = -1;
            try {actualDiv = calculator.squareRoot(25);}catch (ComplexNumberException e){actualDiv = catchException;}
            assertEquals("The expected value should be 3", expectedDiv, actualDiv,0.01);

            try {actualDiv = calculator.squareRoot(-9);}catch (ComplexNumberException e){actualDiv = catchException;}
            assertEquals("The expected value should be -1", catchException, actualDiv,0.01);
        }
}

