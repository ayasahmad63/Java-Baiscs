package com.company;

public class Powerof2n {
    public static void main(String[] args) {
        int n=31;  // note: fix for n =0


        if((n & (n-1))==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
