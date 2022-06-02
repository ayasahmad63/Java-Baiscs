package com.company;

public class StringCompression {
    public static void main(String[] args) {

        // First:- Input :- aaabbcccddaeef     output:- abcdaef
//
//        char[] str= {'a','a','a','b','b','c','c','c','d','d','a','e','e','f'};
//
//        String ans =str[0]+"";
//
//        for (int i=1;i<str.length;i++){
//         if(str[i]!=str[i-1]){
//             ans+=str[i];
//         }
//        }
//
//        System.out.println(ans);











//        Second:- Input :- aaabbccddaeef   Output :- a3b2c2d2ae2f




        char[] str= {'a','a','a','b','b','a','a'};


        String ans =str[0]+"";
        int count=1;

       for(int i=1;i<str.length;i++){


           if (str[i] != str[i-1]) {
               if(count>1){
                   ans=ans+count+str[i];
                   count=1;
               }else{
           ans+=str[i];
               }
           }else{
               count++;
           }


       }if(count>1){
           ans=ans+count;
        }
        System.out.println(ans);
        System.out.println(ans.length());




    }
}
