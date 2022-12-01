package com.interview;

public class Sample3 {
    public static void main(String[] args) {

        int x = 10, y = 20;

        add(x);  //!!! COMPILE ERROR !!!
        add(y);
        findcube(8);
        
    }

    public static void add(int x){    //overloaded method with int and long
        System.out.println(x);
        System.out.println("integer x");
  //      System.out.println(multply(3,5));
    }

    public static int findcube(int a ){
        int cube = a*a*a;
        System.out.println("cube = " + cube);
        return cube;

    }

    //private static int multply(int i, long i1) {
      //  return i * i1 ;
    /*}
    public static long multply (long x , int y){
        return x*y;
    }*/

    /* public static void add(int y){    //overloaded method with long and int
         System.out.println(y);
         System.out.println("long y");
 
     }*/
    public static void add(){
        System.out.println("print method with no parameter");
    }

   /* public static int subtract(int x,int y){
        return x-y;
    }
    public static void subtract(int a, int b){
        System.out.println(a-b);
    }*/
}
