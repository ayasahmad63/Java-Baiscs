public class _11_EqualSumPartition {

//    The Question is will be solve by Target Sum Subsets
//     In this question we first check wheteher it is even or odd if its sum its odd then its return false bcoz odd can never be divided into two equals parts
//         If sum comes to even then  we set target sum=total sum/2  the  question breaks tp Target Sum Subsets

//    youtube videos:-https://www.youtube.com/watch?v=UmMh7xp07kY&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=8


    public static void main(String[] args) {


        int[] arr={1,5,5,11};

        System.out.println(EqualSumPartition(arr));



    }


    public static boolean EqualSumPartition(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];

        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;

        boolean[][] dp=new boolean[arr.length+1][target+1];

        for(int i=0;i<arr.length+1;i++){
            for(int j=0;j<target+1;j++){
                if(i==0 && j==0){
                    dp[i][j]=true;
                }else if(i==0){
                    dp[i][j]=false;
                }else if(j==0){
                    dp[i][j]=true;
                }else {
                    if(j<arr[i-1]){
                        dp[i][j]=dp[i-1][j];
                    }else {
                        if(dp[i-1][j] || dp[i-1][j-arr[i-1]]){
                            dp[i][j]=true;
                        }

                    }
                }
            }
        }



        return dp[arr.length][target];
    }



}
