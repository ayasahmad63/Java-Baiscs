import java.lang.reflect.Method;
import java.util.Arrays;

public class _40_BuyAndSellStockWithCooldown {

//    In this question we use antoner variable to check wheather it is in cooldown period or not and otherwise we just return according to cooldown condotions.



    public static void main(String[] args) {
        int[] prices={1,2,3,0,2};
/*
//        Method 1:-Recursion + Memorization

        int[][][] dp=new int[prices.length][2][2];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
//        System.out.println(helper(prices,0,0,0,dp));
*/

//       Method 2:- Tabulation
//        System.out.println(helper(prices));



    }


    /*
//    Method 1:- Rcursion + Memorization
    public static int helper(int[] prices,int i,int status,int cooldown,int[][][] dp){
        if(i>=prices.length) return 0;
        if(dp[i][status][cooldown]!=-1) return dp[i][status][cooldown];
        if(cooldown==1) {
            return helper(prices,i+1,0,0,dp);
        }

        if(status==0){
            return dp[i][status][cooldown]=Math.max(-prices[i]+helper(prices,i+1,1,0,dp),helper(prices,i+1,0,0,dp));
        }else{
            return dp[i][status][cooldown]=Math.max(prices[i]+helper(prices,i+1,0,1,dp),helper(prices,i+1,1,0,dp));
        }

    }
    */




/*
//    Method 2 :- Tabulation

    public static int helper(int[] prices){
        int[][][] dp=new int[prices.length+1][2][2];
        int cooldown=0;

        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    if(k==1){
                        dp[i][j][k]=dp[i+1][0][0];
                    }else if(j==0){
                        dp[i][j][k]=Math.max(-prices[i]+dp[i+1][1][0],dp[i+1][0][0]);
                    }else{
                        dp[i][j][k]=Math.max(prices[i]+dp[i+1][0][1],dp[i+1][1][0]);
                    }
                }
            }
        }

        return dp[0][0][0];
    }
    */

}
