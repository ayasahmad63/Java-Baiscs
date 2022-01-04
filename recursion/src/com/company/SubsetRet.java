package com.company;

import java.util.ArrayList;

public class SubsetRet {
    public static void main(String[] args) {

        ArrayList<String> ans=Subsequence("abc","");
        System.out.println(ans);

    }

    static ArrayList<String> Subsequence(String str,String ans){

        if(str.isEmpty()){
            ArrayList<String> anss=new ArrayList<>();
            anss.add(ans);
            return anss;
        }
        char ch=str.charAt(0);

        ArrayList<String> left =Subsequence(str.substring(1),ans+ch);
        ArrayList<String> right=Subsequence(str.substring(1),ans);

        left.addAll(right);

        return left;


    }

}
