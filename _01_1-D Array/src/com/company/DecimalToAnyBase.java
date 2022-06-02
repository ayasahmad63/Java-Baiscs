package com.company;

import java.util.Scanner;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number in Decimal");
        int n=sc.nextInt();
        System.out.println("Enter the base to which you want to convert");
        int b=sc.nextInt();

        int sum=0,i=0;
        while(n>0){
            if(n<b){
                sum+=n*Math.pow(10,i);
                break;
            }
            else{
                sum+=n%b*Math.pow(10,i);
                i++;
                n=n/b;
            }
        }
        System.out.println(sum);

    }

}
