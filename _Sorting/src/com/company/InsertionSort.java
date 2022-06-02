package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={2,3,5,1,4};

InsertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }


    static  int[] InsertionSort (int [] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    arr[j]=arr[j]+arr[j-1];
                    arr[j-1]=arr[j]-arr[j-1];
                    arr[j]=arr[j]-arr[j-1];
                }
                else{
                    break;
                }
            }
        }
return arr;


    }
}
