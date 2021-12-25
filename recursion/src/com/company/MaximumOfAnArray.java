package com.company;

public class MaximumOfAnArray {
    public static void main(String[] args) {

        int[] arr={12,70,30,20,50};
        System.out.println(MaxArray(arr,0));
    }
    static int MaxArray(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        if(arr[idx]>arr[idx+1]){
            int temp=arr[idx];
            arr[idx]=arr[idx+1];
            arr[idx+1]=temp;
        }
        return MaxArray(arr,++idx);
    }
}
