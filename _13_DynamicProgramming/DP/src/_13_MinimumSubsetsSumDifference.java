public class _13_MinimumSubsetsSumDifference {


//    In this we have to divide the array into two subsets  in which its subsets sum will be minimum
//       |s1-s2|  will be minimum
//      In this question we going to first find the range of difference which will be from  0 to summation of arr[elements](range)
//       So we going to make Minimize |range-2s1|
//         In Range we going to check which is wheather the  sum or number is going to be in subsets or not
//        After getting the numbers in range subsets to sum up we going to check the minimum for half of the range (range-2s1)
 //    Youtube:-https://www.youtube.com/watch?v=-GtpxG6l_Mc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=11


    public static void main(String[] args) {

        int[] nums={1, 6, 11, 5};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }



        boolean[][] dp=new boolean[nums.length+1][sum+1];

        for(int i=0;i<nums.length+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0 && j==0){
                    dp[i][j]=true;
                }else if(i==0){
                    dp[i][j]=false;
                }else if(j==0){
                    dp[i][j]=true;
                }else {
                    if(j<nums[i-1]){
                        dp[i][j]=dp[i-1][j];
                    }else{
                        if(dp[i-1][j] || dp[i-1][j-nums[i-1]]){
                            dp[i][j]=true;
                        }
                    }
                }
            }
        }

//

        int min=Integer.MAX_VALUE;

        for(int i=0;i<(sum+1)/2;i++){
            if(dp[nums.length][i] && min>sum-2*i ){
                min=sum-2*i;
            }
        }

        System.out.println(min);

    }






}
