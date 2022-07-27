package com.interview;

import java.util.Arrays;

public class CountTheNumber {

    public static void main(String[] args) {


        // when the comparing if elements are equal ,should i count it,or make it -1?
        // is there a limit in array size i am asking for complexity
        // the elements are Integer right ?
        // for the last element should i also make it -1 cause there is no element on the right side


       int[] arr = {2,5,7,9,1,4,7,6};
       // int[] arr = {2,3,4,5,6,7,8,9,1};

       // int min = Integer.MAX_VALUE;
        int min = arr[arr.length-1];
        int count=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]<min){
                min=arr[i];
                arr[i]= -1;
            }else if (arr[i]>min){
                count++;
            }

        }
        System.out.println("count = " + count);
        System.out.println("arr = " + Arrays.toString(arr));



    }


}
