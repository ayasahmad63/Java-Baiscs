package com.company;

import java.util.Scanner;

public class _11_ReverseOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Value at index" +i);
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i] );
        }
        int start=0,end=arr.length-1;

        while(start<end){
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];

            start++;
            end--;

        }
        System.out.println(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i] );
        }

    }



}
