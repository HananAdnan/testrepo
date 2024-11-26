package com.example;

public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    //1st function by hanan
    public int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    //2nd function by sarah
    public double squareRoot(int a){
        if(a < 0){
            throw new IllegalArgumentException("Cannot squareRoot negative number");
        }
        return Math.sqrt(a);
    }
    
     //3rd function by Mariam 
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


}