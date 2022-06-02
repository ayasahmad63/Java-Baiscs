public class _15_UnBoundedKnackSack {

//    The UnBounded Sack Problem in ehich we are going to use any weight twice so , the factor of unbounded will be used

//    Repetition of items allowed

// Youtube link:- https://www.youtube.com/watch?v=jgps7MXtKRQ&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=17


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





}
