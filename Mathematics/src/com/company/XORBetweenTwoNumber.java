package com.company;

public class XORBetweenTwoNumber {
    public static void main(String[] args) {
        int start=3;
        int end=9;

        System.out.println(SetBits(start-1)^SetBits(end));

    }
    static int SetBits(int a){
        if(a%4==0){
            return a;
        }
        else if(a%4==1){
            return 1;
        }
        else if(a%4==2){
            return a+1;

        }
        else if(a%4==3){
            return 0;
        }
        return 1;
    }
}
