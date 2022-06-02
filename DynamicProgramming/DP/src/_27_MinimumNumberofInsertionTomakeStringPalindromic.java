public class _27_MinimumNumberofInsertionTomakeStringPalindromic {

//    It is Similar as Minimum Number of Deletion to make string Palindromic

    public static void main(String[] args) {

        String x="abdhal";

        StringBuilder rev=new StringBuilder(x);
        rev.reverse();

        int[][] dp=new int[x.length()+1][rev.length()+1];

        for(int i=0;i<x.length()+1;i++){
            for(int j=0;j<rev.length()+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if(x.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }

        }

        System.out.println(x.length()-dp[x.length()][rev.length()]);
        
    }


}
