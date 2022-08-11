package com.interview;

import java.util.*;

public class NonRepeatingChar {


    public static void main(String[] args) {

        // string has only one nonRepeating character or more ?
        // can that string be null or not ?
        //

        String sampleString = "aaabhccdeeef";
        String sampleString2 = "abcbad";
        String sampleString3 = "abcabcabc";
        String sampleString4 = "";

        System.out.println("nonRepeating char is = " + nonRepeatingCharacter(sampleString));
        System.out.println("nonRepeating char is = " + nonRepeatingCharacter(sampleString2));
        System.out.println("nonRepeating char is = " + nonRepeatingCharacter(sampleString3));
        System.out.println("nonRepeating char is = " + nonRepeatingCharacter(sampleString4));
    }

    public static List<Character> nonRepeatingCharacter(String sampleString) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < sampleString.length(); i++) {

            char ch = sampleString.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        for (Character each : map.keySet()) {

            if (map.get(each) == 1) {
                arrayList.add(each);
            }

        }
        if (arrayList.size() == 0) return new ArrayList<>(Arrays.asList('-'));
        else return arrayList;//return arrayList.size()==0?new ArrayList<>(Arrays.asList('-')):arrayList;


//        ArrayList<Character> arrayList = new ArrayList<>();
//
//        for (int i = 0; i < sampleString.length(); i++) {
//            arrayList.add(sampleString.charAt(i));
//
//        }
//        System.out.println(arrayList);
//        for (int i = 0; i < arrayList.size(); i++) {
//            char c = arrayList.get(i);
//            int count =Collections.frequency(arrayList,c);
//            if (count==1)
//                return c;
//        }
//
//        return ('-');
//   }
    }
}
