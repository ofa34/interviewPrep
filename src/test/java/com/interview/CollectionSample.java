package com.interview;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionSample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,50,150,10,20,30,40,50,60,70));

        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("--------------------------------------");

        Integer maxNumber = Collections.max(numbers);
        System.out.println("maxNumber is " + maxNumber);

        Integer minNumber = Collections.min(numbers);
        System.out.println("minNumber is " + minNumber);

        System.out.println("--------------------------------------");

        Collections.reverse(numbers);
        System.out.println(numbers);

        System.out.println("--------------------------------------");

        Collections.swap(numbers,1,2);
        System.out.println(numbers);

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);


        int count = Collections.frequency(numbers,50);
        System.out.println(count);

        numbers.addAll(Arrays.asList(50,50,50));
        int count2 = Collections.frequency(numbers,50);
        System.out.println(count2);

    }


}
