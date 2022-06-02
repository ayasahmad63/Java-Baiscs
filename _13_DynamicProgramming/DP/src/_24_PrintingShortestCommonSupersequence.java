public class _24_PrintingShortestCommonSupersequence {

//    Question Statement:- https://www.geeksforgeeks.org/print-shortest-common-supersequence/

//    The solutiion will be same as printing as lcs but the difference is that in this we going to add char once which have same at i,j but add both char at String ans

    public static void main(String[] args) {

        String x="AGGTAB";
        String y="GXTXAYB";



        int[][] dp=new int[x.length()+1][y.length()+1];

        for(int i=0;i<x.length()+1;i++){
            for(int j=0;j<y.length()+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }


        String ans="";

        int i=x.length();
        int j=y.length();
    

        while(i>0 && j>0){

            if(x.charAt(i-1)==y.charAt(j-1)){
                ans=x.charAt(i-1)+ans;
                i--;j--;
            }else {
//                ans=x.charAt(i-1)+y.charAt(j-1)+ans;
                if(dp[i-1][j]>dp[i][j-1]){
                    ans=x.charAt(i-1)+ans;
                    i--;
                }else{
                    ans=y.charAt(j-1)+ans;
                    j--;
                }
            }

        }

        while(i>0){
            ans=x.charAt(i-1)+ans;
            i--;
        }
        while(j>0){
            ans=y.charAt(j-1)+ans;
            j--;
        }

        System.out.println(ans);



    }


}
