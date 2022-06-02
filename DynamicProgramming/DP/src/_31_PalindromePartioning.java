public class _31_PalindromePartioning {

    public static void main(String[] args) {

        String str="eegiicgaeadbcfacfhifdbiehbgejcaeggcgbahfcajfhjjdgj";

        System.out.println(PalindromePartioning(str,0,str.length()-1));
    }

    public static int PalindromePartioning(String str,int i,int j){
        if(i>=j || Palindrome(str,i,j)){
            return 0;
        }
        int count=Integer.MAX_VALUE;

        for(int k=i;k<j;k++){
            int n=PalindromePartioning(str,i,k)+PalindromePartioning(str,k+1,j)+1;

            if(n<count){
                count =n;
            }
        }

        return count;
    }


    public static  boolean Palindrome(String s,int i,int j){
        if(i>j){
            return false;
        }
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
