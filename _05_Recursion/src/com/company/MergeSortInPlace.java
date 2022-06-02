package com.company;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
int[] arr={30,10,80,50,30,90};
MergeImPlace(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void MergeImPlace(int[] arr,int start,int end){
        if(end-start==1){
            return;
        }
       int  mid=(start+end)/2;

        MergeImPlace(arr,start,mid);
        MergeImPlace(arr,mid,end);

        MergeInplaceArray(arr,start,mid,end);


    }

    private static void MergeInplaceArray(int arr[],int start,int mid,int end){
        int[] mix=new int[end-start];

        int i=start,j=mid,k=0;


        while(i<mid && j<end){

            if (arr[i]<arr[j]) {
            mix[k]=arr[i];
            i++;
            }else{
                mix[k]=arr[j];
                j++;
            }k++;
        }
       while(i<mid){
           mix[k]=arr[i];
           i++;
           k++;
       }
       while(j<end){
           mix[k]=arr[j];
           j++;
           k++;
       }

       for(int l=0;l<mix.length;l++){
           arr[start+l]=mix[l];
       }


    }
}
