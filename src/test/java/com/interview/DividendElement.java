package com.interview;

public class DividendElement {

    public static void main(String[] args) {

        // does Array  have zero(0) because if we try to divide a number by zero it will give exception
        // array has only integer right ?
        // if sum of all other element is zero , result will be 0 and i will accept that result right ?

        int[] array = {5,4,9,0,7,10,3,2};

        System.out.println(countOfDividendElement(array));

    }

    public static int countOfDividendElement(int[] array) {

        int sum = 0 ;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i]!=0 && (sum-array[i])%array[i]== 0 ){
                count++;
            }
        }
        return count;
    }


}
