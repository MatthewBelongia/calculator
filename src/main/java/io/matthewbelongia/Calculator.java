package io.matthewbelongia;

/**
 * Created by matthewb on 4/27/16.
 */
public class Calculator {
    static public int add(int value1, int value2){
        return value1 + value2;
    }
    static public int multiply(int value1, int value2){
        return value1 * value2;
    }

    static public int divide(int value1, int value2)throws DivideByZeroException{
        int result = 0;
        if(value2 == 0){
            throw new DivideByZeroException();
        }
        return value1 / value2;
    }
    static public int subtract(int value1, int value2){
        return value1 - value2;
    }
    static public double squareRoot(double value1) throws ComplexNumberException{
        double result =0.0;
        if(value1 < 0){
            throw new ComplexNumberException();
        }
        return Math.sqrt(value1);
    }

}


