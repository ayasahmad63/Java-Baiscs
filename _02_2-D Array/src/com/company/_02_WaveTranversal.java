package com.company;

import java.util.Scanner;

public class _02_WaveTranversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row of first marrix m");
        int r=sc.nextInt();
        System.out.println("Enter the column of first matrix n");
        int c=sc.nextInt();
        int[][] arr1=new int[r][c];
        for(int i=0;i <r;i++){
            for(int j=0; j<c ;j++){
                System.out.println("Enter the vlaue in matrix 1 at m and n is " +i +j);
                arr1[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i <r;i++){
            for(int j=0; j<c ;j++){
                System.out.print(" "+arr1[i][j]);

            }
            System.out.println(" ");
        }


        for(int i=0;i<c;i++){
            if(i%2==0){
                for (int j=0;j<r;j++){
                    System.out.print( " " +arr1[j][i]);
                }
            }
            else{
                for(int j=r-1;j>=0; j--){
                    System.out.print(" " +arr1[j][i]);
                }
            }



        }



    }






}
