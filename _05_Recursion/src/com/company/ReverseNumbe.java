package com.company;

public class ReverseNumbe {
    public static void main(String[] args) {


//        Sum(1234);
//        System.out.println(sum);


        //Second method

        int digits=(int)(Math.log10(1234)+1);
        System.out.println(Rev2(1234,digits));

    }
    static int sum=0;

    static void Rev1(int n){

        if(n%10 == n){
            sum= sum*10+n%10;
            return;
        }

        sum=(n%10)+sum*10;

        Rev1(n/10);
    }


    static int Rev2(int n,int digits){
        if(n%10==n){
        return n;
    }

        return ((n%10)*(int)(Math.pow(10,digits-1))) + Rev2(n/10,digits-1);

}}
