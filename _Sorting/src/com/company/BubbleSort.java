package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={6,3,2,1,4,5};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));



    }

    static  int[] bubblesort(int[] arr){


        for(int i=0;i<arr.length;i++){
            boolean swapped=false;

            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    arr[j]=arr[j]+arr[j-1];
                    arr[j-1]=arr[j]-arr[j-1];
                    arr[j]=arr[j]-arr[j-1];
                     swapped=true;
                }
            }
            if(!swapped){
                break;
            }

        }

        return arr;
    }





}
