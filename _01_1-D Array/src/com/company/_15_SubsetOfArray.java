package com.company;

import java.util.Scanner;

public class _15_SubsetOfArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
      for(int i=0;i<n;i++){
            System.out.println("Enter the value at index" +i);
            arr[i]=sc.nextInt();

        }
       int subno=(int)Math.pow(2,n);
      int[] decarr=new int[n];

        for(int i=0;i<subno;i++){
            int l=decarr.length-1;
            int temp=i;
            while(l>=0){
                decarr[l]=temp%2;
                temp=temp/2;
                l--;

            }
            for(int k=0;k<n;k++){
                if(decarr[k]==0){
                    System.out.print(" " +0);
                }
                else{
                    System.out.print( " " +arr[k]);
                }

            }
            System.out.println(" ");



        }






        // Concise Method




//        for(int i=0;i<arr.length;i++){
//            String set="";
//            int temp=i;
//
//            for(int j=arr.length-1;j>=0;j++){
//                int r=temp%2;
//                temp=temp/2;
//
//
//                if(r==0){
//                    set="-\t" +set;
//
//                }else {
//                    set=arr[j] +"\t" +set;
//                }
//            }
//            System.out.println(set);
//        }





    }



}
