package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr={30,10,90,50,20,40,60,100};
        arr=Merge(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] Merge(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int[] left=Merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=Merge(Arrays.copyOfRange(arr,mid,arr.length));

        return MergeArray(left,right);



    }
    private static int[] MergeArray(int[] left,int[] right){

        int[] mix=new int[left.length+right.length];

        int i=0,j=0,k=0;

        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;

        }
        while (j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;

    }
}
