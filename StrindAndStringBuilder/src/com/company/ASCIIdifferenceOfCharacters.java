package com.company;

public class ASCIIdifferenceOfCharacters {
    public static void main(String[] args) {

      String str= "abdgca";
      String ans=""+str.charAt(0);


      for(int i=1;i<str.length();i++){
         int aa=(str.charAt(i)-str.charAt(i-1));
      ans=ans+aa+str.charAt(i);
      }

        System.out.println(ans);

    }
}
