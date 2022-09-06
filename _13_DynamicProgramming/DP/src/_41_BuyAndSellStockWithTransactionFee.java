import java.util.Arrays;

public class _41_BuyAndSellStockWithTransactionFee {

//     This is normal question but only here it will cut transaction at every every transcation


    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
/*
//        Method 1:- Recursion + Tabulation
        int[][] dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(helper(prices,0,0,fee,dp));
    }
*/


//        Method 2:- Tabulation
        System.out.println(helper(prices,fee));


//

    }


    /*
//    Method 1:- Recursion + Memorization

    public static int helper(int[] prices,int i,int status,int fee,int[][] dp){
        if(i>=prices.length) return 0;
        if(dp[i][status]!=-1) return dp[i][status];
        if(status==0){
            return dp[i][status]=Math.max(-prices[i]+helper(prices,i+1,1,fee,dp),helper(prices,i+1,0,fee,dp));
        }else{
            return dp[i][status]=Math.max(prices[i]+helper(prices,i+1,0,fee,dp)-fee,helper(prices,i+1,1,fee,dp));
        }
*/






//    Method 2:- Tabulation
 public static int helper(int[] prices,int fee){
        int[][] dp=new int[prices.length+1][2];

        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(j==0){
                    dp[i][j]=Math.max(-prices[i]+dp[i+1][1],dp[i+1][0]);
                }else{
                    dp[i][j]=Math.max(prices[i]+dp[i+1][0]-fee,dp[i+1][1]);
                }
            }
        }
        return dp[0][0];
    }





}
