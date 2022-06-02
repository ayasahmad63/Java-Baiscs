import java.util.Arrays;

public class _17_LongestCommonSubsequence {

// This is the most important question in
//  Problem statement:- https://leetcode.com/problems/longest-common-subsequence/




    public static void main(String[] args) {


         String x="abcde";
         String y="abce" ;

//         Method 1

//        System.out.println(LongesetCommonSubsequence1(x,y,x.length()-1,y.length()-1));




//        Method 2:-

//         for(int i=0;i<x.length();i++) {
//             Arrays.fill(dp[i], -1);
//         }
//
//        System.out.println(LongestCommonSubsequence2(x,y,x.length()-1,y.length()-1));




//      Method 3:-
        System.out.println(LongestCommonSubsequence3(x,y));


    }




//  Method 1:- Only Recursion Approach

    public static int LongesetCommonSubsequence1(String x,String y,int m,int n){
        if(m<0 || n<0){
            return 0;
        }

        if(x.charAt(m)==y.charAt(n)){
            return 1+ LongesetCommonSubsequence1(x,y,m-1,n-1);
        }

        return Math.max(LongesetCommonSubsequence1(x,y,m,n-1),LongesetCommonSubsequence1(x,y,m-1,n));

    }




//    Method 2 :- Memorization Method

//    In static int we will make a array of constraints
    static int[][] dp=new int[1001][1001];


    public static int LongestCommonSubsequence2(String x,String y,int m,int n){
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n]!=-1){
           return  dp[m][n];
        }
        if(x.charAt(m)==y.charAt(n)){
            dp[m][n]=1+LongestCommonSubsequence2(x,y,m-1,n-1);
            return dp[m][n];
        }
        dp[m][n]=Math.max(LongestCommonSubsequence2(x,y,m-1,n),LongestCommonSubsequence2(x,y,m,n-1));

        return dp[m][n];
    }







//    Method 3 :- Top Down Approach


    public static int  LongestCommonSubsequence3(String x,String y){

        int m=x.length();
        int n=y.length();

        int[][] dp=new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m][n];

    }






















}
