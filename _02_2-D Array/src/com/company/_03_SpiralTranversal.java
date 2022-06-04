package com.company;

import java.util.Scanner;

public class _03_SpiralTranversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


         int[][] arr={
                 {01,02,03,04,05,06,07},
                 {11,12,13,14,15,16,17},
                 {21,22,23,24,25,26,27},
                 {31,32,33,34,35,36,37},
                 {41,42,43,44,45,46,47}

         };
        int r=arr.length-1;
        int c=arr[0].length-1;


        for(int i=0;i <r;i++){
            for(int j=0; j<c ;j++){
                System.out.print(" "+arr[i][j]);

            }
            System.out.println(" ");

        }

        System.out.println(" ");


         int minr=0;
         int minc=0;
         int n=(r)*(c);
         int count=0;
         String movie="";

         while (count<n){

             // left tranversal

                for( int i=minr,j=minc;i<=r&&count<n;i++){
                    System.out.print(" " +arr[i][j]);
                    minr++;count++;
                }minr--;
                minc++;



             // bottom tranversal

               for(int i=minr,j=minc;j<=c&&count<n;j++){
                   System.out.print(" " +arr[i][j]);
                   minc++;count++;
               }minc--;
                minr--;


             //right tranversal
               for(int i=minr,j=minc;i>=0&&count<n;i--){
                   System.out.print(" " +arr[i][j]);
                   minr--;count++;

               }minr++;
               minc--;




             //upper tranversal

             for(int i=minr,j=minc;j>=0&&count<n;j--){
                 System.out.print(" " +arr[i][j]);
                 minc--;count++;
             }minc++;
             minr++;




         }








    }
}
