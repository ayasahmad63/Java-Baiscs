public class _20_ShortestCommonSupersequence {

//     Question statement:-https://www.geeksforgeeks.org/shortest-common-supersequence/
//      So, the length of  shortest Commmon Supersequence is that we first length of both string then minus length of lcs string
//           Answer :- length of first string + length of second string - length of lcs string
//


    public static void main(String[] args) {
       String   str1 = "AGGTAB",  str2 = "GXTXAYB";

       int[][] dp=new int[str1.length()+1][str2.length()+1];

       for(int i=0;i<str1.length()+1;i++){
           for(int j=0;j<str2.length()+1;j++){
               if(i==0 || j==0){
                   dp[i][j]=0;
               }else if(str1.charAt(i-1)==str2.charAt(j-1)) {
                   dp[i][j]=1+dp[i-1][j-1];
               }else{
                   dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
               }
           }
       }

       int ans=str1.length()+str2.length()-dp[str1.length()][str2.length()];

        System.out.println(ans);



    }







}
