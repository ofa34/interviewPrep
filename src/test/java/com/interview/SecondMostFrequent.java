package com.interview;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class SecondMostFrequent {

    public static void main(String[] args) {

        String s = "Bananannb";

        System.out.println(SecondFrequentChar(s));

    }

    public static Character SecondFrequentChar(String s) {
        Map<Character,Integer> map = new HashMap<>();

        s= s.toLowerCase();
        int mostFrequent=0,secondMostFrequent =0;
        Map.Entry<Character,Integer> first = null;
        Map.Entry<Character,Integer> second = null;

        for (int i = 0; i < s.length(); i++) {


            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
        System.out.println(map);
        for (Map.Entry each:map.entrySet()) {
            if ((int)each.getValue()>mostFrequent){
                second=first;
                first = each;
                mostFrequent=(int)each.getValue();

            }else if ((int)each.getValue()>secondMostFrequent && (int)each.getValue()!= mostFrequent ){
                second=each;
            }
        }



     return second.getKey();
    }


}
