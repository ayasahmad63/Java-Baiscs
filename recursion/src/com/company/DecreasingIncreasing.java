package com.company;

public class DecreasingIncreasing {
    public static void main(String[] args) {
        Printing(5);
    }
    static void Printing(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        Printing(n-1);
        System.out.println(n);


    }
}
