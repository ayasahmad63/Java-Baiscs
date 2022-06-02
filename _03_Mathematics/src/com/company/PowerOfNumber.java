package com.company;

public class PowerOfNumber {
    public static void main(String[] args) {

        int n=3;
        int base=5;
        int ans=1;

        while(n>0){
            if((n&1)==1){
                ans=ans*base;
            }

            base=base*base;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
