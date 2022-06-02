public class _18_LongestCommonSubstring {

//    It is similar to Longest Common Subsequence but only the difference is if the elements at i does not match with y then the value assign will be zero
//    After that we put traverse throughout the arrays and then check for the higher values in the array


    public static void main(String[] args) {

        String x="abcd";
        String y="anjls";


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
//                    Here the code changes for Substring, In Subsequence the code will be dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])
                    dp[i][j]=0;
                }
            }
        }


        int max=Integer.MIN_VALUE;

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }
        }

        System.out.println(max);
    }


}
