package com.company;

public class WordCombination {
    public static void main(String[] args) {
Combination("12","");
    }

    static  void Combination(String str,String ans){

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit=str.charAt(0)-'0';

        for(int i=(digit-1)*3;i<digit*3;i++){

            char ch=(char)(digit+i+'a'-1);
            Combination(str.substring(1),ans+ch);


        }



    }

}
