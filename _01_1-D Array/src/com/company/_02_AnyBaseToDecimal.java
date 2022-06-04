package com.company;

import java.util.Scanner;

public class _02_AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println("Enter the base of the Number ");
        int b1=sc.nextInt();
        System.out.println("Enter the base you want to convert");
        int b2=sc.nextInt();
         int sum=0,i=0;
        while(n>0){
            if(n<b1){
                sum+=n*Math.pow(b1,i);
                break;
            }
            else{
                sum+=n%b2*Math.pow(b1,i);
                n=n/b2;
                i++;
            }

        }
        System.out.println(sum);

    }
}
