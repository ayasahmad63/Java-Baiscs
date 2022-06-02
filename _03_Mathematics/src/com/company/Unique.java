package com.company;

public class Unique {
    public static void main(String[] args) {

        int[] n={1,9,7,9,8,1,6,7,8};
        System.out.println(ans(n));

    }

    static  int ans(int[] n){
        int unique=0;

        for(int num: n){
            unique=unique^num;

        }
        return unique;
    }
}
