import java.util.Arrays;

public class _15_UnBoundedKnackSack {

//    The UnBounded Sack Problem in ehich we are going to use any weight twice so , the factor of unbounded will be used
//    Repetition of items allowed and there are infinite supply of weight
//    https://www.geeksforgeeks.org/unbounded-knapsack-repetition-items-allowed/

//    Youtube Link:-https://www.youtube.com/watch?v=OgvOZ6OrJoY
//     In this we solve by taking max of 1) the element at index n and reduce n-1 2) does not take element and doesnot  reduce n.


    public static void main(String[] args) {
        int W = 100;
        int val[]  = {1, 30};
        int wt[] = {1, 50};
        // Method 1)
//        System.out.println(UnboudedKnapSack1(val,wt,W,val.length-1));
        //



        //  Method 2) Memorized
/*
        int[][] dp1=new int[val.length][W+1];

        for(int i=0;i<val.length;i++){
            Arrays.fill(dp1[i],-1);
        }

        System.out.println(UnBoundedKnapSack2(val,wt,W,val.length-1,dp1));
*/


//        Method 3) Tabulation

        System.out.println(UnBoundedKnapSack3(val,wt,W));






    }



//    Method 1) Recursioe
//      Time Complexity:- O(2^n)
//      Space Complexity:-O(1)

/*
     public static int UnboudedKnapSack1(int[] val, int[] wt, int w, int n,){
        if(n==0){
//            At zero it put all the value present at idx 0
            return (w/wt[0])*val[0];
        }

        int NOtTake=UnboudedKnapSack1(val,wt,w,n-1);

        int Take=Integer.MIN_VALUE;
        if(wt[n-1]<w){
            Take=Math.max(val[n]+UnboudedKnapSack1(val,wt,w-wt[n],n),Take);
        }
        return Math.max(Take,NOtTake);
     }



*/







//     Method 2 ) Memorized
//        Time Complexity: O(N*W)
//        Space Complexity: O(N*W) + O(N)’


/*
    public static int UnBoundedKnapSack2(int[] val,int []wt,int w,int n,int[][] dp){
        if(n==0){
            return (w/wt[0])*val[0];
        }

        if(dp[n][w]!=-1) return dp[n][w];

        int NotTake=0+UnBoundedKnapSack2(val,wt,w,n-1,dp);

        int Take=Integer.MIN_VALUE;
        if(wt[n]<=w){
            Take=Math.max(Take,val[n]+UnBoundedKnapSack2(val,wt,w-wt[n],n,dp));

        }

        dp[n][w]=Math.max(Take,NotTake);
        return dp[n][w];
    }





*/






//Method 3:- Tabulation
//        Time Complexity: O(N*W)
//        Space Complexity: O(N*W) + O(N)’



    public static int UnBoundedKnapSack3(int val[],int[] wt,int w) {
        {
            int[][] dp3 = new int[val.length][w + 1];

            for (int i = 0; i < val.length; i++) {
                for (int j = 0; j < w+1; j++) {
                    if (i == 0) {
                        dp3[i][j] = (w/wt[0])*val[0];
                    } else {
                            int Nottake = dp3[i - 1][j];
                            int Take = Integer.MIN_VALUE;
                            if (wt[i]<=j) {
                                Take = val[i]+dp3[i][j - wt[i]];
                            }
                            dp3[i][j] = Math.max(Take, Nottake);

                    }
                }



            }
            for (int i=0;i<val.length;i++){
                for (int j=0;j<w+1;j++){
                    System.out.print("  "+dp3[i][j]);
                } System.out.println("");
            }
            return dp3[val.length - 1][w];
        }



































// Youtube link:- https://www.youtube.com/watch?v=jgps7MXtKRQ&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=17

    /*
      public static void main(String[] args) {

       int val[] = {10, 40, 50, 70};
        int wt[]  = {1, 3, 4, 5};


        int W=8;

        int[] dp=new int[W+1];


        for(int i=1;i<dp.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<wt.length;j++){
                if(wt[j]<=i){

                    int num=val[j]+dp[i-wt[j]];
                    if(num>max){
                        max=num;
                    }
                }

            }
            dp[i]=max;
        }


        for(int i=0;i<dp.length;i++){
            System.out.print("  "+dp[i]);
        }



    }

*/



    }}
