package com.company.pepcoding;

public class Abbreviation {
    public static void main(String[] args) {
        Abbrev("pep","",0);

    }

    static void Abbrev(String str,String ans,int count){
    if(str.isEmpty()){
         if(count!=0){
             System.out.println(ans+count);
        return;
         }
        System.out.println(ans);
        return;
    }
        char ch=str.charAt(0);
    if(count!=0){
        Abbrev(str.substring(1),ans+count+ch,0);

    }
     else{
         Abbrev(str.substring(1),ans+ch,count);
    }

     Abbrev(str.substring(1),ans,count+1);


    }



}
