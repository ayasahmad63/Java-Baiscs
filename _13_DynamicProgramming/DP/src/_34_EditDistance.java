import java.util.Arrays;

public class _34_EditDistance {

//    Question link:- https://leetcode.com/problems/edit-distance/
//    Youtubelink:- https://www.youtube.com/watch?v=fJaKO8FbDdo&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=34

    //    In this question we are going to perform 3 operattion 1-Insert,2-Delete,3-Replace
//         if char at s (i) match with char at t(j) then we have no need to perform any operation otherwise we have to perform
//                      1+Distance(word1,word2,i-1,j,dp); // Deletion
//                        1+Distance(word1,word2,i,j-1,dp); // Insertion
//                       1+Distance(word1,word2,i-1,j-1,dp); //Replace
//         Then we take min of these three
    public static void main(String[] args) {

        String word1 = "horse", word2 = "ros";
//        Method 1:- Recursion + Memorization

/*        int[][] dp1=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            Arrays.fill(dp1[i],-1);
        }
        System.out.println(Distance1(word1,word2,word1.length()-1,word2.length()-1,dp1));
*/


//        Method 2:- Tabulation

//        System.out.println(Distance2(word1, word2));



//        Method 3:- Space Optimization

        System.out.println(Distance3(word1,word2));

    }

//    Method 1:- Recursion + Memorization
//         Space optimization:- O(n*m)
//          Time Optimization:-O(n*m)
    /*
    public static  int Distance1(String word1,String word2,int i,int j,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)){
            return dp[i][j]=Distance1(word1,word2,i-1,j-1,dp); // Similar so no operation need to perform
        }

        int a=1+Distance1(word1,word2,i-1,j,dp); // Deletion
        int b=1+Distance1(word1,word2,i,j-1,dp); // Insertion
        int c=1+Distance1(word1,word2,i-1,j-1,dp); //Replace

        return dp[i][j]=Math.min(a,Math.min(b,c));
    }
*/


//    Method 2:- Tabulation
    //         Space optimization:- O(n*m)
//             Time Optimization:-O(n*m)

/*
    public static int Distance2(String word1,String word2){

        int[][] dp=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i< word1.length()+1;i++){
            for(int j=0;j<word2.length()+1;j++){
                if(i==0){
                    dp[i][j]=j;
                }else if(j==0){
                    dp[i][j]=i;
                }else if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }

            }
        }


        return dp[word1.length()][word2.length()];
    }


*/








//    Method 3:-Space Optimization
//          Space Optimization:-O(2*n)
//          Time Optimization:-O(n*m)

    public static  int Distance3(String word1,String word2){

        int[][] dp=new int[word1.length()+1][word2.length()+1];
        int i=0;
        for(i=1;i<word1.length()+1;i++){
            for(int j=0;j<word2.length()+1;j++){
                if(i==0){
                    dp[i%2][j]=j;
                }else if(j==0){
                    dp[i%2][j]=i;
                }else if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i%2][j]=dp[(i+1)%2][j-1];
                }else{
                    dp[i%2][j]=1+Math.min(dp[(i+1)%2][j-1],Math.min(dp[(i+1)%2][j],dp[i%2][j-1]));
                }
            }
        }

        return dp[(i+1)%2][word2.length()];
    }




}