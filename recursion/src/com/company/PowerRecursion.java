package com.company;

public class PowerRecursion {
    public static void main(String[] args) {
        System.out.println(Power(5,3));
    }



    static  int Power(int x,int n){

        if(n==0){
            return 1;
        }
        int xn=x*Powerlogarithm(x,n-1);
        return xn;
    }





//    Time Comlexity is Log n for thuis solution


    static int Powerlogarithm(int x,int n){
        if(n==0){
            return 1;
        }
        int xn=Powerlogarithm(x,n/2)*Powerlogarithm(x,n/2);

        if((n&1)==1){
            xn=xn*x;
        }
        return xn;

    }




}
 