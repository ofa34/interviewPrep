package com.interview;

import java.util.HashMap;
import java.util.Map;

public class StringFrequency {

    public static void main(String[] args) {


        String str = "aabbccddeea";
        System.out.println(freqStr(str));


    }

    public static Map<Character,Integer> freqStr(String str) {

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);

        }
        return map;


    }


}
