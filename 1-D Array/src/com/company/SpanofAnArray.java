package com.company;

import java.util.Scanner;

public class SpanofAnArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
         int n= sc.nextInt();
         int[] arr= new int[n];
         for(int i=0;i<n;i++){
             System.out.println("Enter the value of array at " +i );
             arr[i]= sc.nextInt();
         }
         int max=arr[0];int min=arr[0];
         for(int i=0;i<n;i++){
             if(arr[i]>max){
                 max=arr[i];
             }
             else if(arr[i]<min){
                 min=arr[i];
             }

         }
        System.out.println(max-min);

    }
}
