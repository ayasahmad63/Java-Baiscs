package com.company;

import java.util.Arrays;

public class Main {

    static  int[][] dp;
    public static void main(String[] args) {
	// write your code here
        int[] we={2,5,1,3,4};
        int[] val={15,14,10,45,30};
        int W=7;

        dp=new int[we.length+1][W+1];
        for(int i=0;i<we.length+1;i++){
            Arrays.fill(dp[i],-1);
        }


        System.out.println(KnapSack(we,val,W,we.length));
        for(int i=0;i<we.length+1;i++){
            for(int j=0;j<W+1;j++){
                System.out.print(" "+dp[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static  int  KnapSack(int[] we,int[] val,int W,int n){

        if(W==0 || n==0) return 0;

        if(dp[n][W]!=-1)return dp[n][W];
        if(we[n-1]>W){
            dp[n][W]=KnapSack(we,val,W,n-1);
            return dp[n][W];
        }


        dp[n][W]= Math.max(val[n-1]+KnapSack(we,val,W-we[n-1],n-1),KnapSack(we,val,W,n-1));

         return dp[n][W];


    }
}
