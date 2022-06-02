public class _22_LongestPalindromicSubsequence {

//    Question Statement:- https://leetcode.com/problems/longest-palindromic-subsequence/

//    In this question we going to reverse a string and find lcs between string and reverse string then it will be longest palindromic subsequence

    public static void main(String[] args) {

        String x="bbbab";

        StringBuffer rev= new StringBuffer(x);
        rev.reverse();
        System.out.println(rev);

        int[][] dp=new int[x.length()+1][rev.length()+1];

        for(int i=0;i<x.length()+1;i++){
            for(int j=0;j<rev.length()+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if(x.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }


        System.out.println(dp[x.length()][rev.length()]);
    }



}
