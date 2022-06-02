package com.company;

public class iTHbit {
    public static void main(String[] args) {
        int n=35;

        int k=8;

        n=(n&(1<<(k-1)))>>(k-1);
        System.out.println(n);
    }
}
