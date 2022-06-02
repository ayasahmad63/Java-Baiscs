package com.company;

public class Fibonnaci {
    public static void main(String[] args) {

        System.out.println(Fibo(9));
        }


        static int Fibo(int n) {

        if(n<2){
            return n;
        }

        return (Fibo(n-1)+ Fibo(n-2));


        }



}
