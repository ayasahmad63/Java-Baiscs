public class _21_MinimumNumberOfInsertionDeletiontoConvertOneStringToAnother{

//    Question:-https://www.geeksforgeeks.org/minimum-number-deletions-insertions-transform-one-string-another/
    
//     From Insertiion and Deletion we first going to find lcs between two string
//     After that we are going for Insertion :- string b - lcs and Deletion :- string a- lcs


    public static void main(String[] args) {


        String x="heap";
        String y="pea";

        int[][] dp=new int[x.length()+1][y.length()+1];

        for(int i=0;i<x.length()+1;i++){
            for(int j=0;j<y.length()+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                } else if (x.charAt(i-1) == y.charAt(j-1)) {

                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }


        System.out.println("Minimum Deletion :-  " +(x.length()-dp[x.length()][y.length()]));
        System.out.println("Minimum Insertion :-   "   +(y.length()-dp[x.length()][y.length()]));
    }


}
