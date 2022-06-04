package com.company;

import java.util.Scanner;

public class _01_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row of first marrix m");
        int m=sc.nextInt();
        System.out.println("Enter the column of first matrix n");
        int n=sc.nextInt();
        int[][] arr1=new int[m][n];
        for(int i=0;i <m;i++){
            for(int j=0; j<n ;j++){
                System.out.println("Enter the vlaue in matrix 1 at m and n is " +i +j);
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the row of first marrix m");
        int p=sc.nextInt();
        System.out.println("Enter the column of first matrix n");
        int q=sc.nextInt();
        int[][] arr2=new int[p][q];
        for(int i=0;i <p;i++){
            for(int j=0; j<q ;j++){
                System.out.println("Enter the vlaue in matrix 1 at m and n is " +i +j);
                arr2[i][j]=sc.nextInt();
            }
        }

        int[][] mularr=new int[m][q];

        if(n!=p){
            System.out.println("Matrix cannot be Multiple");
        }
        else{

            for(int i=0;i<m;i++){
                for(int j=0;j<q;j++){
                    for(int k=0;k<n;k++){
                        mularr[i][j]+=arr1[i][k]*arr2[k][i];
                    }
                }
            }

            for(int i=0;i <p;i++){
                for(int j=0; j<q ;j++){
                    System.out.print(" " +mularr[i][j] );
                }
                System.out.println(" ");
            }











        }


    }

}
