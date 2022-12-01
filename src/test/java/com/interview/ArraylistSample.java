package com.interview;

import java.util.*;

public class ArraylistSample {


    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add("omer");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(" " +arrayList.get(i));
        }
        System.out.println();
        System.out.println(arrayList);

        int a = arrayList.size();
        System.out.println("a = " + a);

        System.out.println(arrayList.get(1));

        arrayList.set(1,25);
        System.out.println(arrayList);

        arrayList.add(40);
        arrayList.remove(1);
        System.out.println(arrayList);

        arrayList.add("faruk");

        System.out.println(arrayList);
        arrayList.remove("faruk");
        System.out.println(arrayList);

        System.out.println(arrayList.indexOf(40));

        System.out.println(arrayList.contains(40));
        System.out.println(arrayList.contains(30));

        ArrayList<Object> arrayList1 = new ArrayList<>();

        arrayList1.addAll(arrayList);

        System.out.println(arrayList);
        System.out.println(arrayList1);
        System.out.println(arrayList1.equals(arrayList));
        arrayList1.addAll(Arrays.asList(10,20,30,40));
        System.out.println(arrayList1);

        System.out.println(arrayList1.containsAll(arrayList));

        System.out.println("------------------------------");
        arrayList1.retainAll(Arrays.asList(10,20,30,40));
        System.out.println(arrayList1);

        for (Object each : arrayList1) {
            System.out.println(each);
        }

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.addAll(Arrays.asList(1,1,1,2,2,3,3,4,4,4,5,6,6,7));
        System.out.println(arrayList2);

    /*    for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList2.get(i)<5){
                arrayList2.remove(i);
            }
        }

        System.out.println(arrayList2);*/

        arrayList2.removeIf(each -> each<5);
        System.out.println(arrayList2);


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("omer","omer","kemal","kaan","arda","eda","java","Junit","Jquery"));
        names.removeIf(p-> p.startsWith("j")||p.startsWith("J"));
        System.out.println(names);

        ArrayList<Integer> list3 =new ArrayList<>();
        list3.addAll(Arrays.asList(100,3000,200,300,300,400,500,800,700));
        System.out.println(list3);
        Collections.sort(list3);
        System.out.println(list3);

        System.out.println(Collections.max(list3));

        Integer minNumber = Collections.min(list3);
        System.out.println("minimun number in the list is = " + minNumber);

        ArrayList<Integer> reversList = new ArrayList<Integer>((list3));
        Collections.reverse(reversList);
        System.out.println(reversList);

        Collections.swap(reversList,1,2);
        System.out.println(reversList);

        Collections.swap(reversList,0,reversList.size()-1);
        System.out.println(reversList);

        int frequency = Collections.frequency(reversList,300);
        System.out.println(frequency);

        System.out.println("--------------------------");

        int[] arr1 = {10,20,30,40};
        int[] arr2 = {30,40,50,60};
        int lengthOfArrays=arr1.length+arr2.length;
        int[] newArray = new int[lengthOfArrays];
        for (int i = 0 ;i<newArray.length;i++){
            if (i<arr1.length){
                newArray[i] = arr1[i];
            }else {
                newArray[i]=arr2[i-arr2.length];
            }
        }
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        System.out.println("--------------------------------------------");




        ArrayList<Integer> listOfArray = new ArrayList<>();
        for (int i = 0; i < lengthOfArrays; i++) {
            if (i<arr1.length) {
                listOfArray.add(arr1[i]);
            }else{
                listOfArray.add(arr2[i-arr2.length]);
            }

        }
        System.out.println(listOfArray);

        Collections.sort(listOfArray);
        System.out.println(listOfArray);

        HashSet<Integer> newHashMap = new LinkedHashSet<>(listOfArray);
        System.out.println(newHashMap);

        System.out.println("-----------------------");
        int freq = Collections.frequency(listOfArray,30);
        System.out.println("freq = " + freq);

        System.out.println("arrayListSize = " + listOfArray.size());

        for (int i = 0; i < listOfArray.size()-1; i++) {

            if (listOfArray.get(i).equals(listOfArray.get(i+1))){
                listOfArray.remove(i);
            }

        }
        System.out.println(listOfArray);



    }
}
