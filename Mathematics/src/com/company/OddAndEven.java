package com.company;

public class OddAndEven {
    public static void main(String[] args) {


        int n = 64;
        System.out.println(isOdd(n));

    }
    static  boolean isOdd(int n){

        return ( (n&1) ==1 );
    }
}
