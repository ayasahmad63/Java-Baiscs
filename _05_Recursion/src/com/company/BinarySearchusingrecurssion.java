package com.company;

public class BinarySearchusingrecurssion {
    public static void main(String[] args) {
        int[] arr={1,4,7,8,9,12,15,16,18,19,20,32,33,36,39,41,46,49,50,51,56};
        int target=9;
        System.out.println(BinarySearch(arr,target,0,arr.length-1));

    }

    static int BinarySearch(int[] arr,int target,int start,int end){

        int mid=start+(end-start)/2;
        if (start > end){
            return -1;
        }

        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return BinarySearch(arr,target,mid+1,end);
        }
        else{
            return BinarySearch(arr,target,start,mid-1);
        }
    }
}
