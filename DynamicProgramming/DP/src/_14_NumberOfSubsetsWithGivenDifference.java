public class _14_NumberOfSubsetsWithGivenDifference {

//  In this we  going to have R2-R1=given differrence and  R1+R2=Total arr[i]  after addition of this number
//      R2=(Given Difference + Total arr[i])/2,then it will become Count Number of Subsets Equal To Sum


    public static void main(String[] args) {

        int[] nums={1,1,2,3};
        int difference=1;

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        int target=(difference+sum)/2;



        int[][] dp=new int[nums.length+1][target+1];

        for(int i=0;i<nums.length+1;i++){
            for(int j=0;j<target+1;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                }
                else if(i==0){
                    dp[i][j]=0;
                }
                else if(j==0){
                    dp[i][j]=1;
                }
                else {
                    if(j<nums[i-1]){
                        dp[i][j]=dp[i-1][j];
                    }else {
                        dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
                    }
                }
            }
        }

//
//        for(int i=0;i<nums.length+1;i++){
//            for(int j=0;j<target+1;j++){
//                System.out.print(" "+dp[i][j]);
//            }
//            System.out.println(" ");
//        }


        System.out.println(dp[nums.length][target]);



    }






}
