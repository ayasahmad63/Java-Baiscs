import java.util.Arrays;

public class _37_BuyandSellStock2 {

//  In this question we check every combination
//     At each index  we have to check wheather we buy or sell the stock. For buy we use 0 for buy and 1 for sell
//      So at every index we extract all the possibilites



    public static void main(String[] args) {

       int[]  prices = {1,2,3,4,5};


//       Method 1:- Recursion + Memorization
/*
       int[][] dp=new int[prices.length][2];
       for(int i=0;i<prices.length;i++){
           Arrays.fill(dp[i],-1);
       }

        System.out.println(helper(prices,0,0,dp));
*/


//        Method 2:- Tabulation
        System.out.println(helper2(prices));

    }


//    Method 1:- Recursion and Memorization
    /*
      public static int helper(int[] prices,int i,int status,int[][] dp){
        if(i>=prices.length) return 0;

        if(dp[i][status]!=-1) return dp[i][status];

        if(status==0){
            return dp[i][status]=Math.max(-prices[i]+helper(prices,i+1,1,dp),helper(prices,i+1,0,dp));
        }
            return dp[i][status]=Math.max(+prices[i]+helper(prices,i+1,0,dp),helper(prices,i+1,1,dp));


      }
*/



//      Method 2:- Tabulation


    public static int helper2(int[] prices){
        int[][] dp=new int[prices.length+1][2];

        for(int i=prices.length;i>=0;i--){
            for(int j=0;j<2;j++){
                if(i==prices.length){
                    dp[i][j]=0;
                }else if(j==0){
                    dp[i][j]=Math.max(-prices[i]+dp[i+1][1],dp[i+1][0]);
                }else{
                    dp[i][j]=Math.max(prices[i]+dp[i+1][0],dp[i+1][1]);
                }
            }
        }

        return Math.max(dp[0][0],0);
    }



}
