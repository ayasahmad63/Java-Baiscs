package com.company;

import java.util.Scanner;

public class _13_InverseOfAnArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number for array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the number from 1 to 4");
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            System.out.print(" " +arr[i]);
        }

        System.out.println("  ");
        int[] inv=new int[n];

        for(int i=0;i<arr.length;i++){

          int v=arr[i];
          inv[v]=i;

        }

        for(int i=0;i<n;i++){
            System.out.print(" " +inv[i]);
        }






    }



}
