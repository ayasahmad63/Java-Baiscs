package com.company;

import java.util.Scanner;

public class _14_SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array want to ente");
        int n=sc.nextInt();
        char[] ch=new char[n];
        for(int i=0;i<ch.length;i++){
            System.out.println("Enter the Character at index " +i);
            ch[i]=sc.next().charAt(0);
        }


        for( int i=0;i<ch.length;i++){
            for(int j=i;j<ch.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(" " +ch[k]);
                }
                System.out.println(" ");
            }
        }





    }
}
