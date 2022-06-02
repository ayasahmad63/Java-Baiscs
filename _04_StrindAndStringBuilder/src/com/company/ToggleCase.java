package com.company;

public class ToggleCase {
    public static void main(String[] args) {
        String str="popCODIng";

        String ans="";


        for(int i=0;i<str.length();i++){
            int num=(int)str.charAt(i);
            if((num>=65 && num<=90)){
                num+='a'-'A';
                ans=ans+(char)num;
            }else{
                num=num+'A'-'a';
                ans=ans+(char)num;
            }
        }



        System.out.println(ans);

    }
}
