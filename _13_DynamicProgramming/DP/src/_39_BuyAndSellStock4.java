import java.util.Arrays;

public class _39_BuyAndSellStock4 {

// In this question,it is similar to previous question but only the difference is that we use k instead to 2

    public static void main(String[] args) {

           int[] prices = {2,4,1};int  k = 2;
//        Method 1:- Recursion + Memorization

        int[][][] dp=new int[prices.length][2][k];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        System.out.println(helper(prices,0,0,k-1,dp));


    }


    public static int helper(int[] prices,int i,int status,int k,int[][][] dp){
        if(i>=prices.length || k<0) return 0;

        if(dp[i][status][k]!=-1) return dp[i][status][k];

        if(status==0){
            return dp[i][status][k]=Math.max(-prices[i]+helper(prices,i+1,1,k,dp),helper(prices,i+1,0,k,dp));
        }else{
            return dp[i][status][k]=Math.max(prices[i]+helper(prices,i+1,0,k-1,dp),helper(prices,i+1,1,k,dp));
        }
    }
}
