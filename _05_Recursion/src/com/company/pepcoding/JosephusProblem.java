package com.company.pepcoding;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(Josephus(5,4));
    }


    static  int Josephus(int n,int k){
        if(n==1){
            return 0;
        }
        int x=Josephus(n-1,k);
        int y=(x+k)%n;
        return y;
    }
}
