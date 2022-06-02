import java.util.Arrays;

public class _10_KnapSack {


    public static void main(String[] args) {


        int[] we={2,5,1,3,4};
        int[] val={15,14,10,45,30};
        int W=7;



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



        for(int i=0;i<we.length+1;i++){
            for(int j=0;j<W+1;j++){
                System.out.print(" "+dp[i][j]);
            }
            System.out.println("");
        }


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









































}
