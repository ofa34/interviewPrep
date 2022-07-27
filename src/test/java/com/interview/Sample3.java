package com.interview;

public class Sample3 {
    public static void main(String[] args) {

        int x = 10, y = 20;

        add(x,y);  //!!! COMPILE ERROR !!!

    }

    public static void add(int x, long y){    //overloaded method with int and long
        System.out.println(x + y);
        System.out.println("integer and long");
    }

    public static void add(long x, long y){    //overloaded method with long and int
        System.out.println(x + y);
        System.out.println("long and integer");


    }
}
