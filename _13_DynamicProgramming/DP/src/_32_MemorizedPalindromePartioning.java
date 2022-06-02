import java.util.Arrays;

public class _32_MemorizedPalindromePartioning {

    public static void main(String[] args) {

        String str="eegiicgaeadbcfacfhifdbiehbgejcaeggcgbahfcajfhjjdgj";

        int[][] dp=new int[str.length()][str.length()];

        for( int i=0;i<str.length();i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(Palindrome(str,0,str.length()-1,dp));
    }

    public static  int Palindrome(String str,int i,int j,int[][] dp){
        if(i>=j || isPalindrome(str,i,j)) {return 0;}

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int count=1;
            if(dp[i][k]!=-1){
                count+=dp[i][k];
            }else{
                count+=Palindrome(str,i,k,dp);
            }

            if(dp[k+1][j]!=-1){
                count+=dp[k+1][j];
            }else{
                count+=Palindrome(str,k+1,j,dp);
            }
//            int coun=Palindrome(str,i,k,dp) +Palindrome(str,k+1,j,dp) +1;
            dp[i][j]=count;
            if(count<ans) {
                ans = count;
            }
        }

        return ans;

        }



    public  static boolean isPalindrome(String str,int i,int j) {
    if(i>j) {
      return false;
    }

    while(i<j) {
        if (str.charAt(i) != str.charAt(j)) {
            return  false;
        }
    i++;
        j--;
    }
    return true;
    }
}
