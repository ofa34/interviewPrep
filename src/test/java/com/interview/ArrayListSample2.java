package com.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSample2 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9));
        System.out.println(list);

        System.out.println("--------------------------------------");

        list.removeIf(each -> each < 5);
        System.out.println(list);

        System.out.println("--------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("omer","omer","java","java","kaan","eda"));
        names.removeIf(name-> name.startsWith("j"));
        System.out.println(names);

        System.out.println("--------------------------------------");






    }


}
