package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] arr={1,2,5,4,3};

         SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] SelectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-1;j++){

                if(arr[i]<arr[j])
                {
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
             }
         }

        return arr;
    }


}
