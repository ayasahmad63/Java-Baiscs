public class _16_RodCuttingProblem {

//   This is similar to unbounded Unknacksack Problem

//    Question:- https://www.geeksforgeeks.org/cutting-a-rod-dp-13/?ref=lbp

    public static void main(String[] args) {

        int[] len={1,2,3,4,5,6,7,8};
        int[] prize={1,5,8,9,10,17,17,20};


        int leng=8;

        int[] dp=new int[leng+1];

        for(int i=1;i<dp.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<len.length;j++){
                if(len[j]<=i){
                    int num=prize[j]+dp[i-len[j]];
                    if(num>max){
                        max=num;
                    }
                }
            }
            dp[i]=max;
        }


        for(int i=0;i<dp.length;i++){
            System.out.print("   "+dp[i]);

        }

    }







}
