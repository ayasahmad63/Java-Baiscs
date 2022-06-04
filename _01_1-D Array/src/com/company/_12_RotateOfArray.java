package com.company;

import java.util.Scanner;

public class _12_RotateOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of the array");
        int n=sc.nextInt();
        char[] word=new char[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the number  at the index " +i);
            word[i]=sc.next().charAt(0);
        }

        System.out.println("Enter the number you want to shift ");
        int k=sc.nextInt();
        if(k<0)k+=n;

        k=k%n;



        //  Brute and Crude Method   Time complexity is More
//        while(k>0){
//            char ch=word[word.length-1];
//
//            for(int i=word.length-1;i>0;i--){
//
//                word[i]=word[i-1];
//
//
//            }
//            word[0]=ch;
//            k--;
//
//        }
//        for(int i=0;i<n;i++){
//            System.out.print("  " +word[i]);
//
//        }

        for(int i=0;i<n;i++){
            System.out.print("  " +word[i]);

        }


        System.out.println(" ");



        // Concise Method


        reverse(word, 0,word.length-k-1 );

        reverse(word, word.length-k-1,word.length-1 );

        reverse(word, 0,word.length-1 );


        for(int i=0;i<n;i++){
//            System.out.print("  " +word[i]);

        }





    }
     static void reverse(char[] word,int i, int e){
           int m=i;
           int n=e;
        while(i<e){
          char temp=word[i];
          word[i]=word[e];
          word[e]=temp;


            i++;
            e--;
        }
         for(int p=m;p<n;p++){
             System.out.print("  " +word[p]);

         }
         System.out.println(" ");

    }



}
