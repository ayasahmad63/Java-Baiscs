package com.company;

import java.util.Arrays;

public class _09_BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(Search(arr,36)));

    }
    static int[] Search(int[][] arr,int target){
        int start=0;
        int end=arr[0].length-1;
        while(start<arr.length && end >=0){

            if(target== arr[start][end]){
                return new int[]{start,end};
            }
            else if(target<arr[start][end])
            {
                end--;
            }
            else{
                start++;
            }


        }
        return new int[]{-1,-1};
    }
}
