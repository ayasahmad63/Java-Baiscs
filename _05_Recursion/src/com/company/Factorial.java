package com.company;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(fact(0));

    }
    static int fact(int n){

        if(n<2){
            return 1;
        }

        int ans=n;

        return ans*fact(n-1);

    }
}
