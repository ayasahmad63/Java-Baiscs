package com.company;

import java.util.Scanner;

public class _05_AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int n1=sc.nextInt();
        System.out.println("Enter the Second Number");
        int n2=sc.nextInt();
        System.out.println("Enter the base of the number");
        int b= sc.nextInt();
        int sub=0,n,x=0,p=1,temp1,temp2;
        while(n1>0 || n2>0){

            temp1=n1%10;
            temp2=n2%10;
            temp1=temp1-x;
            n1=n1/10;
            n2=n2/10;
            if(temp1<temp2){
                n=temp1+b-(temp2);
                x=1;

            }
            else{
                n=temp1-(temp2);
                x=0;

            }
            sub+=n*p;
            p=p*10;



        }

        System.out.println(sub);
    }



}
