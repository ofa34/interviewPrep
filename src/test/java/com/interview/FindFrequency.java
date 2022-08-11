package com.interview;

import java.util.*;

public class FindFrequency {

    public static void main(String[] args) {

        int[] array = {2,3,4,5,2,4,8,4,8};

      frequencyOfArray(array);



    }

    private static void frequencyOfArray(int[] array) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i],map.getOrDefault(array[i],0)+1 );
        }
        System.out.println(map);


    }

}
