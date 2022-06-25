import java.util.Arrays;

public class _33_DistinctSubsequences {

// Question link:-https://leetcode.com/problems/distinct-subsequences/
//    Youtube link:-https://www.youtube.com/watch?v=nVG7eTiD2bY&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=33

//    In this question we find all ways to check in strings from recurssion.
//      We take two pointer i,j at end of both string then we do
//         if s.charAt(i)==s.charAt(j) { fun(i-1,j-1) +fun(i-1,j) else {fun(i-1,j)}
//            if j==-1 that means all char of string all compared so return 1 and if i ==-1 then return 0
    public static void main(String[] args) {

       String s = "babgbag", t = "bag";

//       Method 1:- Recursion + Tabulation
       /*

       int[][] dp1=new  int[s.length()][t.length()];
       for(int i=0;i<s.length();i++){
           Arrays.fill(dp1[i],-1);
       }

     System.out.println(Distinct(s,t,s.length()-1,t.length()-1,dp1));

*/


//       Method 2:- Tabulation

//        System.out.println(Distinct2(s,t));



//        Method 3:- Space Optimized




//      Method 4:-  Space Optimized:

//        System.out.println(Distinct3(s,t));


//        Method 5:- 1 D Array Optimization

        System.out.println(Distinct5(s,t));

    }
//    Recursion + Tabulation
//      Space optimization:-0(n*m)
//      Time optimization:-O(n*m)

   /*

    public static int Distinct(String s,String t,int i,int j,int[][] dp){
        if(j==-1) return 1;
        if(i==-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)!=t.charAt(j)){
            return dp[i][j]= Distinct(s,t,i-1,j,dp);
        }

        return dp[i][j]=Distinct(s,t,i-1,j-1,dp) +Distinct(s,t,i-1,j,dp);
    }

*/






//  Method :- Tabulation
//      Space optimization:-0(n*m)
//      Time optimization:-O(n*m)

    /*
    public static int Distinct2(String s,String t){

        int[][] dp=new int[s.length()+1][t.length()+1];

        for(int i=0;i<s.length()+1;i++){
            for(int j=0;j<t.length()+1;j++){
                if(j==0){
                    dp[i][j]=1;
                }else if(i==0){
                    dp[i][j]=0;
                }else if(s.charAt(i-1)!=t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                }
            }
        }

        return dp[s.length()][t.length()];
    }

*/





//    Method 3:-Space Optimized:
//    Time Complexity:-O(n*m)
//    Space Complexity:- O(2*m)
/*
    public static int Distinct3(String s,String t){
        int [][] dp=new int[2][t.length()+1];
           int i=0;
        for( i=0;i<s.length()+1;i++){
            for(int j=0;j<t.length()+1;j++){
                if(j==0){
                    dp[i%2][j]=1;
                }else if(i==0){
                    dp[i%2][j]=0;
                }else if(s.charAt(i-1)!=t.charAt(j-1)){
                    dp[i%2][j]=dp[(i+1)%2][j];
                }else{
                    dp[i%2][j]=dp[(i+1)%2][j]+dp[(i+1)%2][j-1];
                }
            }
        }

        return dp[(i+1)%2][t.length()];
    }


*/


//    Method 5:- 1 D array Approach

    public static int Distinct5(String s,String t){
        int[] dp=new int[t.length()+1];
        dp[0]=1;
        for(int i=1;i<s.length()+1;i++){
            for(int j=t.length();j>0;j--){
                if (s.charAt(i-1)==t.charAt(j-1)){
                    dp[j]=dp[j]+dp[j-1];
                }
            }
        }
        return dp[t.length()];
    }




}
