package com.company;

import java.util.Arrays;

public class CycleSort  {
    public static void main(String[] args) {

        int arr[]={3,1,4,5,2};

CyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] CyclicSort(int[] arr){

            int i=0;
            while(i<arr.length){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    arr[i]=arr[i]+arr[correct];
                    arr[correct]=arr[i]-arr[correct];
                    arr[i]=arr[i]-arr[correct];
                }
                else{
                    i++;
                }
            }
return arr;
    }


}
