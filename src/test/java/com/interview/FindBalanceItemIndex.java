package com.interview;

public class FindBalanceItemIndex {


    /*
 *  Given an array of integers, write a function to return the index of an item
 *   in the array, where the sum of all items on its left is equal to the sum
 *   of the ones on the right.
 *   For example :
       Given [4, 9, 1, 3, 6, 4]
       your function should return 2
       because the item at index 2 is 1, and 4+9 =3+6+4
 */
    public static void main(String[] args) {

        int[] array = {4, 9, 1, 3, 6, 4};

        int balanceIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if( addBeforeIndex(array, i) == addAfterIndex(array, i)){
                balanceIndex = i;
            }

        }
        System.out.println(balanceIndex);
    }
    // create one method to sum the numbers BEFORE index
    public static int addBeforeIndex(int[] array, int index) {
        int total = 0;
        for (int i = 0; i < index; i++) {
            total += array[i];
        }
        return total;
    }
    // create one other method to sum the numbers AFTER index
    public static int addAfterIndex(int[] array, int index) {
        int total = 0;
        for (int i = index + 1; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

}
