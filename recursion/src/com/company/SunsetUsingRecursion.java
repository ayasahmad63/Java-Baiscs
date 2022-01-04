package com.company;

public class SunsetUsingRecursion {
    public static void main(String[] args) {
        String str="abc";
Sunsequences("",str);
    }
    static  void Sunsequences(String p,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=str.charAt(0);

        Sunsequences(p+ch,str.substring(1));
        Sunsequences(p,str.substring(1));


    }

}
