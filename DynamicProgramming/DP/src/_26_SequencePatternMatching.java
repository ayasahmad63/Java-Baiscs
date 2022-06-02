public class _26_SequencePatternMatching {

//    Question Statement :- Check wheather the first string is subsequence to second string
//
//    We have to find the lcs between two string and check wheather the length of first string is equal to second string if yeas print true otherwise false


    public static void main(String[] args) {
        String x="abac";
        String y="ajabfjc";

        int[][] dp=new int[x.length()+1][y.length()+1];

        for(int i=0;i<x.length()+1;i++){
            for(int j=0;j<y.length()+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if (x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }


        if(x.length()==dp[x.length()][y.length()]){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }


}
