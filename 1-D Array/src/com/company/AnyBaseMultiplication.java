package com.company;

import java.util.Scanner;

// Not c

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int n1=sc.nextInt();
        System.out.println("Enter the Second Number");
        int n2= sc.nextInt();
        System.out.println("Enter the base of the number");
        int b= sc.nextInt();

        int mul=products(n1,n2,b);
        System.out.println(mul);

    }

    static  int products(int n1, int n2, int b) {
        int prod=0,p=1;
        while (n2 > 0) {
            int temp2 = n2 % 10;
            n2 = n2 / 10;

            int singlemul = singleproducts(temp2, n1, b);
              prod+=sumtoall(prod,singlemul*p,b );
             p=p*10;

        }
        return prod;
    }

        static int singleproducts(int temp2,int n1,int b){
             int sin=0,p=1;  int c=0;
              while(n1>0 || c>0){
                  int temp=n1%10;
                  n1=n1/10;
                 int  d=temp*temp2 +c;

                  c=c/b;
                  d=d%10;


                   sin=sin+d*p;
                   p=p*10;
              }
            System.out.println(sin);

              return sin;
        }

         static  int sumtoall(int n1,int n2,int b) {
             int sum = 0, temp1, p = 1, temp2, c = 0;
             while (n1 > 0 || n2 > 0 || p > 0) {

                 temp1 = n1 % 10;
                 temp2 = n2 % 10;
                 n1 = n1 / 10;
                 n2 = n2 / 10;

                 int n = temp1 + temp2 + c;
                 c = n / b;
                 n = n % b;
                 sum += n * p;
                 p = p * 10;

             }
//             System.out.println(sum);


             return sum;
         }



//    static  int sum()



}
