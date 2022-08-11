package com.interview;

public class CountOfRepeatedChar<newString> {
    /**
     * Write a method that compresses a string based on the count of repeated characters. aabcccddaaaa --> a2b1c3d2a4
     */


    public static void main(String[] args) {

        String repeatedChar = "aabcccddaaaai";

        System.out.println(countOfRepeatedChar(repeatedChar));

    }

    public static String countOfRepeatedChar(String repeatedChar) {

     //   if (!repeatedChar.isEmpty())
            repeatedChar+=" ";

        String newString = "";
        int count =1;

        for (int i = 0; i < repeatedChar.length()-1; i++) {

            if (repeatedChar.charAt(i) == repeatedChar.charAt(i+1) ){
                count++;
            }else {
                newString=""+ newString+repeatedChar.charAt(i)+count;
                count=1;
            }
        }return newString;


    }
}

//        System.out.println(compressedString("aaja"));
//
//    }
//
//    public static String compressedString(String str) {
//        String result = "";
//
//        //if the string is empty  then return empty string
//        if (str.isEmpty()){
//            return result;
//        }
//
//        //if the string has just one letter than return it directly
//        if (str.length() == 1) {
//            result = String.valueOf(str.charAt(0)) + 1;
//            return result;
//        }
//        int count = 1;
//        for (int i = 0; i < str.length() - 1; i++) {
//
//            //compare current character with the next one if same increase the count
//            if (str.charAt(i) == str.charAt(i + 1)) {
//                //if the last character is same with the previous one we are at last iteration and increase count and add it to result
//                if (i + 1 == str.length() - 1) {
//                    count++;
//                    result += String.valueOf(str.charAt(i)) + count;
//                }
//                count++;
//                continue;
//            }
//            result += String.valueOf(str.charAt(i)) + count;
//            count = 1;
//
//        }
//
//        //if the last character is not same with the previous one add the last character with 1
//        if (str.charAt(str.length()-2)!=str.charAt(str.length()-1)){
//            result += String.valueOf(str.charAt(str.length()-1)) + 1;
//        }
//
//        return result;
//