package com.interview;

public class Sampel3 {
    public static void main(String[] args) {


       String words = "one two three four";
       String[] arr = words.split(" ");
        System.out.println(arr.length);

        String word = "amazon";
        String reverseWord="" ;
        for (int i = 0; i < word.length(); i++) {
            reverseWord = word.charAt(i) + "-" +reverseWord;

        }
        reverseWord= reverseWord.substring(0,reverseWord.length()-1);
        System.out.println(reverseWord);

       // int m = myMethod(1,2,3);
    }

    public static int myMethod(int i){
       int x = i * i ;
    return x;
    }
}
