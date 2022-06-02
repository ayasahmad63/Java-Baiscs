public class _19_PrintingLongestCommonSubsequence {

//    In this we start from end of matrix, from m,n and we check we char at m is equal to n then we add char to ans String and traverse to i-1,j-1 matrix
//     Otherwise we going to check for greater number which are have at i-1,j and j-1,i then traverse to that matrix which has highest value
//     It is a part of the lcs


    public static void main(String[] args) {

        String x="abce";
        String y="abdje";

        int[][] dp=new int[x.length()+1][y.length()+1];

        for(int i=0;i<x.length()+1;i++){
            for(int j=0;j<y.length()+1;j++){
                if(i==0 || j==0 ){
                    dp[i][j]=0;
                }else if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                 }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }




        String ans="";
        int m=x.length();
        int n=y.length();
        while(m>0 && n>0){
            if (x.charAt(m-1) == y.charAt(n-1)) {
                ans=x.charAt(m-1)+ans;
                m--;
                n--;
            }else
            {
                if(dp[m-1][n]>dp[m][n-1]){
                    m--;
                }else{
                    n--;
                }
            }
        }

        System.out.println(ans);
    }




}
