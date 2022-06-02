public class _25_LongestRepeatingSubsequence {

//   Question Statement:-  https://www.geeksforgeeks.org/longest-repeating-subsequence/

//    In this we going to find lcs of same string but only add one condition that i!=j so the subsequence which comes twice will be obtained

    public static void main(String[] args) {

        String x="aabb";

        String y=x;

        int[][] dp=new int[x.length()+1][y.length()+1];
        for(int i=0;i<x.length()+1;i++){
            for (int j=0;j<y.length()+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if(x.charAt(i-1) ==y.charAt(j-1) && i!=j){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }


        System.out.println(dp[x.length()][y.length()]);
    }



}
