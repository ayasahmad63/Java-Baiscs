package com.company;

public class IsSubsequence {
    public static void main(String[] args) {
       String s = "abc", t = "ahbgdc";
        if (IsSubsequence(s,"",t,0)>0){
            System.out.println(true);;
        }
        System.out.println(false);
    }
   static  int IsSubsequence(String str,String ans,String t,int nums){
        if(t.isEmpty()){
            if(ans.equals(str)){
                return 1;
            }
            System.out.println(ans);
            return 0;
        }

        char ch=t.charAt(0);

        int left=IsSubsequence(str,ans+ch,t.substring(1),nums);
        int right=IsSubsequence(str,ans,t.substring(1),nums);

        nums=nums+left+right;
        return nums;

    }
}
