package com.interview;

import java.util.Arrays;

public class MaxProfit {


    public static void main(String[] args) {

        // number days can be changeable or fixed
        // if i can achieve same profit with different days, i can take one of them right ?
        // if a profit is not possible should i return minimum loss ?


        int [] array = {7,0,4,3,6,0,4};

        System.out.println(maxprofit(array));


    }

    public static String maxprofit(int[] arr) {

        int min_value = arr[0];
        int profitmax = 0;
        int minIndex = 0;
        int[] newArr = new int[2];
       
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min_value){
                min_value=arr[i];
                minIndex=i;
            }else if (arr[i]-min_value>profitmax){
                profitmax=arr[i]-min_value;

               newArr[0]=minIndex;
               newArr[1] = i;
            }
        }


     return Arrays.toString(newArr);
    }


}
