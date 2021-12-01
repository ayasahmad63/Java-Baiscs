package com.company;

public class PalindroneString {

    public static void main(String[] args) {
        String str=  "abccbc";
//        System.out.println(IsPalin(str));


        // Print all the substring which are palindrome

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String str2=str.substring(i,j);
                if(IsPalin(str2)){
                    System.out.println(str2);
                }
            }
        }
    }

    static boolean IsPalin(String str){
        if(str==null || str.length()==0){
            return true;
        }


        for(int i=0;i<=str.length()/2;i++){
            char start=str.charAt(i);
            char end= str.charAt(str.length()-1-i);

            if(start!=end ){
                return false;
            }
        }


        return true;
    }

}
