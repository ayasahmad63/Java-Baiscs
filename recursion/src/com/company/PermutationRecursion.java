package com.company;

public class PermutationRecursion {
    public static void main(String[] args) {

        Permutation("abc","");

    }

    static void Permutation(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=str.charAt(0);

        for(int i=0;i<=ans.length();i++){
            Permutation(str.substring(1),ans.substring(0,i)+ch+ans.substring(i,ans.length()));
        }

    }

}
