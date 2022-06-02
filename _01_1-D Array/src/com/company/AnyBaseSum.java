package com.company;

import java.util.Scanner;

public class AnyBaseSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int n1=sc.nextInt();
        System.out.println("Enter the Second Number");
        int n2=sc.nextInt();
        System.out.println("Enter the base of the Numbers");
        int b=sc.nextInt();

        int sum=0,temp1,p=1,temp2,c=0;
        while(n1>0 || n2>0 || p>0){

            temp1=n1%10;
            temp2=n2%10;
            n1=n1/10;
            n2=n2/10;

            int n=temp1 +temp2+c;
            c=n/b;
            n=n%b;
            sum+=n*p;
            p=p*10;

        }
        System.out.println(sum);


    }


}
