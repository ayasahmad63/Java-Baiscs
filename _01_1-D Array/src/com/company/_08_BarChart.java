package com.company;

import java.util.Scanner;

public class _08_BarChart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of arr to take");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value of array at the index " +i);
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=max;i>0;i--){
            for(int j=0;j<arr.length;j++){
                if(i<=arr[j]){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
