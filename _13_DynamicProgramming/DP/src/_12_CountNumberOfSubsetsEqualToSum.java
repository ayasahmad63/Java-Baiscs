public class _12_CountNumberOfSubsetsEqualToSum {


//    It I same as Target Sum Sunsets

    public static void main(String[] args) {

        int[] arr={1, 1, 1, 1};
        int tar=1;

        int[][] dp=new int[arr.length+1][tar+1];

        for(int i=0;i<arr.length+1;i++){
            for(int j=0;j<tar+1;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                }else if(i==0){
                    dp[i][j]=0;
                }else if(j==0){
                    dp[i][j]=1;
                }else {
                    if(j<arr[i-1]){
                       dp[i][j]=dp[i-1][j];
                    }else {
                        dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                    }
                }
            }
        }

        System.out.println(dp[arr.length][tar]);

    }





}
