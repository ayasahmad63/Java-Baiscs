package com.company;

import java.util.Arrays;

public class BubbleSortUsingRecyrsion {
    public static void main(String[] args) {

        int[] arr={4,3,2,1};

        BubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));


    }

    static void BubbleSort(int[] arr,int row,int column){
        if(row==0){
            return;
        }
        if(column<row){
             if(arr[column]>arr[row]){
                 int temp=arr[column];
                 arr[column]=arr[row];
                 arr[row]=temp;
             }
             BubbleSort(arr,row,column+1);

        }else{
            BubbleSort(arr,row-1,0);
        }
    }
}
