package com.interview;

public class FactorialOfNumber {

    // Find Factorial of a number without using loop


    public static void main(String[] args) {
        System.out.println("Factorial of = " + factorial(5));
    }

    public static int factorial(int num){

        if( num >= 1){
            return num * factorial(num-1);
        }else {
            return 1;
        }

    }

}
