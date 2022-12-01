package com.interview;

import java.util.Arrays;

public class PutAllZeroEnd {

    public static void main(String[] args) {


        int[] arr = {2, 3, 0, 0, 5, 0, 8};

        int[] result = new int[arr.length];

        //int resul ={0,0,0,0,0,0,0}

        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int index;
        for (int i = 0; i < result.length; i++) {

            index=arr[i]== 0 ? rightIndex-- : leftIndex++;
            result[index]=arr[i];
//            if (arr[i] == 0) {
//                result[rightIndex--]=0;
//
//            }else {
//                result[leftIndex++]=arr[i];
//            }

        }
        System.out.println(Arrays.toString(result));
    }
}
/*$DEFAULT_CONTENT
<br/>
<h4>Cucumber Report:</h4>
<br/>
<a href="http://52.91.240.71/:8081/job/profillo-smoke-test/${BUILD_NUMBER}/cucumber-html-reports/overview-features.html">Smoke Test Result</a>*/