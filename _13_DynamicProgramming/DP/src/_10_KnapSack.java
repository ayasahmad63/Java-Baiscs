import java.util.Arrays;

public class _10_KnapSack {

// https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/

    public static void main(String[] args) {


        int[] we={2,5,1,3,4};
        int[] val={15,14,10,45,30};
        int W=7;

// Recursive Approach are watch from Aditya VermaS

//        Mehod 1:- Recursive Approach
//        int ans1=KnapSnack1(we,val,W,we.length);
//        System.out.println(ans1);




//        Method 2;- Memorized

//        Arrays.fill(dp, -1);




//         Method 3:- Top-Down Approach

        int[][] dp=new int[we.length+1][W+1];
        for(int i=0;i<we.length+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else{
                    if(j<we[i-1]){
                        dp[i][j]=dp[i-1][j];
                    }else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-we[i-1]]+val[i-1]);
                    }
                }
            }
        }








//        Method 4:- Space Optimized Approach





        int[][] dp2=new int[2][W+1];

        for(int i=0;i<we.length+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 ||j==0 ){
                    dp2[i%2][j]=0;
                }else if(we[i-1]>j){
                    dp2[i%2][j]=dp2[(i+1)%2][j];
                }else{
                    dp2[i%2][j]=Math.max(dp2[(i+1)%2][j],dp2[(i+1)%2][j-we[i-1]]+val[i-1]);
                }
            }
        }


//        System.out.println(dp2[we.length%2][W]);





//      Method 5:- 1-D Array Approach

        int[] dp3=new int[W+1];

        for(int i=1;i<we.length+1;i++){
            for(int j=W;j>=0;j--){
                if(we[i-1]<=j){
                    dp3[j]=Math.max(dp3[j],dp3[j-we[i-1]]+val[i-1]);
                }
            }
        }


        System.out.println(dp3[W]);









//        for(int i=0;i<we.length+1;i++){
//            for(int j=0;j<W+1;j++){
//                System.out.print(" "+dp2[i][j]);
//            }
//            System.out.println("");
//        }


    }

//    Method 1 :- Recursive Approach
//        Time Complexity :- O(2^n)
//        Space Complexity :- O(1)


    public static int KnapSnack1(int[] we,int[] val,int W,int n  ){
        if(W==0 || n==0){
            return 0;
        }

        if(we[n-1]>W){
            return KnapSnack1(we,val,W,n-1);
        }

        return Math.max(val[n-1]+KnapSnack1(we,val,W-we[n-1],n-1),KnapSnack1(we,val,W,n-1));
    }






//      Method 2:-  Memorized
//          Time Complexity: O(N*W).
//          Space Complexity: O(N*W).
    public static int[][] dp=new int[4][51];

    public static int KnapSack2(int[] we,int[] val,int W,int n){
        if(W==0 || n==0){
            return 0;
        }
        if(dp[W][n]!=-1){
            return dp[W][n];
        }

        if(we[n-1]>W){
            dp[W][n]=KnapSnack1(we,val,W,n-1);
                    return dp[W][n];
        }

        dp[W][n]=Math.max(val[n-1]+KnapSnack1(we,val,W-we[n-1],n-1),KnapSack2(we,val,W,n-1));

        return dp[W][n];


    }

















//    Method 3;- Top-Down Approach

//
//    Time Complexiy:-O(N*W)
//    Space Complexity:- O(N*W)










//     Method 4:- Space Optimized Approach
//    In this Approach we reduced any no of row or any no of column to 2 as in tabulation there is only need of that row and previous row
//    Youtube Link:-  https://www.youtube.com/watch?v=7C_FIc7PytA
//    In this Approach we use M[i] == M[i%2]

//        Space Complexity:-O(2*W)
//         Time Complexity:- O(N*W)




//    int[][] dp2=new int[2][W+1];
//
//        for(int i=0;i<we.length+1;i++){
//        for(int j=0;j<W+1;j++){
//            if(i==0 ||j==0 ){
//                dp2[i%2][j]=0;
//            }else if(we[i-1]>j){
//                dp2[i%2][j]=dp2[(i+1)%2][j];
//            }else{
//                dp2[i%2][j]=Math.max(dp2[(i+1)%2][j],dp2[(i+1)%2][j-we[i-1]]+val[i-1]);
//            }
//        }
//    }
//
//
//        System.out.println(dp2[we.length%2][W]);
//








//        Method 5:- More Space Optimized Approach

//     In this we use 1-D Array instead of 2-D Array
//    In this approach it should  Traverse from Right to left while ilterating in Second loop

//    Youtube link:- https://www.youtube.com/watch?v=GqOmJHQZivw
//         Watch:-36:45

//    Time Comlexity:-O(N*W)
//    Space Complexity:-O(W)












}
