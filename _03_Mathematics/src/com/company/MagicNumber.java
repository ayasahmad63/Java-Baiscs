package com.company;

public class MagicNumber {
    public static void main(String[] args) {
        int n=3;
        int ans=0;
        int p=5;

        while(n>0){

            ans=ans+(n&1)*p;
            p=p*5;

            n=n>>1;
        }
        System.out.println(ans);

    }

}
