package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class SumofTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the variable you want to enter inn array1");
        int n1= sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            System.out.println("Enter the element of first array at index" +i);
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter the element want to enter in array 2");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            System.out.println("Enter the element of second arr at index " +i);
            arr2[i]= sc.nextInt();
        }
        int[] arr3=new int[n1>n2?n1:n2];

        int m=arr1.length-1;
        int n=arr2.length-1;
        int k=arr3.length-1;

        int c=0;
        while(k>=0){
             int d=c;

             if(m>=0){
                 d+=arr1[m];
             }
             if(n>=0){
                 d+=arr2[n];
             }

             c=d/10;
             d=d%10;

             arr3[k]=d;

             k--;
             m--;
             n--;


        }
        if(c>0){
            arr3[0]+=c*10;
        }

        for(int i=0; i<arr3.length;i++){
            System.out.print("  " +arr3[i]);
        }


    }
}
