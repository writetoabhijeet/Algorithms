package com.java.practise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * kadanes-algorithm :
 * Given a array with +ve and -ve integer ,
 * find the maximum sum such that you are not allowed to skip
 * 2 contiguous elements ( i.e you have to select at least one of them to move forward).
 *
 * Created by USER on 10-03-2018.
 */
public class kadanesAlgorithm {

    public static int maximiseRating(int[] inputArr) {

        int result = 0;
        int[] opt=new int [inputArr.length];

        for(int counter=inputArr.length - 1; counter >= 0;counter--){
          //  opt[i] = arr[i] + (some other elements after i)
//            opt[i] = arr[i] + max(opt[i+1], opt[i+2])
        }

        return result;
    }
    public static int kandies(int[] inputArray)
    {
        int n= inputArray.length;
        int[] opt = new int[n + 2];

        for (int i = n - 1; i >= 0; i--)
        {
            opt[i] = inputArray[i] + Math.max(opt[i + 2], opt[i + 1]);
        }

        int result = (Math.max(opt[0], opt[1]));
        return result;
    }


    public static void main(String[] args) {

        int[] a1 = {-1, -3, -2};//-3
        int[] a2 = {9, -1, -3, 4, 5}; //17
        int[] a3 = {-1, -2, -3, -4, -5};//-6

        System.out.println("-3 is answer =>" +kandies(a1));
        System.out.println("17 is answer =>" +kandies(a2));
        System.out.println("-6 is answer =>" +kandies(a3));

    }


}
