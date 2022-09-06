public class _38_BuyAndSellStock3 {


//    In this question we are give to allow only 2 transaction so we have define a variable cap and add new condition cap<2
//       then return 0 and In memorization we made array of 3 dimensional

    public static void main(String[] args) {

        int[] prices = {3,3,5,0,0,3,1,4};

//        Method 1:- Memorization + Recursion

/*
        int[][][] dp1=new int[prices.length][2][2];
        for(int i=0;i<prices.length;i++){
            dp1[i][0][0]=-1;
            dp1[i][0][1]=-1;
            dp1[i][1][0]=-1;
            dp1[i][1][1]=-1;
        }
        System.out.println(helper1(prices,0,0,1,dp1));
*/




//        Method 2:- Tabulation


//        System.out.println(helper2(prices));




    }



/*

//    Method 1:- Recursion + Memorization

    public static int helper1(int[] prices,int i,int status,int cap,int[][][] dp){
        if(i>=prices.length || cap<0) return 0;

        if(dp[i][status][cap]!=-1) return dp[i][status][cap];

        if(status==0){
            return dp[i][status][cap]=Math.max(-prices[i]+helper1(prices,i+1,1,cap,dp),helper1(prices,i+1,0,cap,dp));
        }else{
            return dp[i][status][cap]=Math.max(prices[i]+helper1(prices,i+1,0,cap-1,dp),helper1(prices,i+1,1,cap,dp));
        }

    }
*/




/*
//   Method 2:- Tabulation
    public static int helper2(int[] prices){
        int[][][] dp=new int[prices.length+1][2][3];
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int k=1;k<3;k++){
                    if(j==0){
                        dp[i][j][k]=Math.max(-prices[i]+dp[i+1][1][k],0+dp[i+1][0][k]);
                    }else{
                        dp[i][j][k]=Math.max(prices[i]+dp[i+1][0][k-1],0+dp[i+1][1][k]);
                    }
                }
            }
        }
        return dp[0][0][2];
    }

*/











}
