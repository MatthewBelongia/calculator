package io.matthewbelongia;

import org.junit.Assert;
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
            int actualSum = calculator.sum(2, 2);
            assertEquals("The expected value should be 2", expectedSum, actualSum);
        }
        @Test
        public void multTest(){
            Calculator calculator = new Calculator();
            int expectedMult = 9;
            int actualMult = calculator.mult(3,3);
            assertEquals("The expected value should be 9",expectedMult,actualMult);
        }
        @Test
        public void DivTest() {
            Calculator calculator = new Calculator();
            int expectedDiv = 3;
            int actualDiv = calculator.div(9, 3);
            assertEquals("The expected value should be 3", expectedDiv, actualDiv);
        }
        @Test
        public void DiffTest() {
            Calculator calculator = new Calculator();
            int expectedDiff = 6;
            int actualDiff = calculator.diff(9, 3);
            assertEquals("The expected value should be 6", expectedDiff, actualDiff);
        }
}

