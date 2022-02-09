package com.company.StackPractice;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {

        Stack<Character> str=new Stack<>();


         String   string ="(a+b)+((c+d))";
         for(int i=0;i<string.length();i++){
             char ch=string.charAt(i);
             if(ch==')'){
                 if(str.peek()=='('){
                     System.out.println(false);
                 }else{
                     while(str.peek()!='('){
                         str.pop();
                     }str.pop();
                 }

             }
             else{
                 str.push(ch);
             }
         }

        System.out.println(true);

    }


}
