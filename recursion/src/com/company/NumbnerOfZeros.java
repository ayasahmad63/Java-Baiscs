package com.company;

public class NumbnerOfZeros {
    public static void main(String[] args) {

        System.out.println(Count(300901,0));
    }

    static  int Count(int n,int count){
        if(n<=0){
            return count;
        }

        if(n%10==0){
            Count(n/10,count++);
        }

        return    Count(n/10,count);


    }
}
