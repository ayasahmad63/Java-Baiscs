package com.company;

public class Main {

    public static void main(String[] args) {
	String str="aajhappleikhijfsaaa";
    StringBuilder str2=new StringBuilder("");
//        System.out.println(Skip(str,0,str2));

//        System.out.println(Skip2(str));

        System.out.println(SkipApple(str));


    }
//
//    static String Skip(String str,int i,StringBuilder str2){
//        if(i==str.length()){
//            return str2.toString();
//        }
//
//        if(str.charAt(i) != 'a'){
//            str2.append(str.charAt(i));
//        }
//
//        return Skip(str,++i,str2);
//
//
//    }


    //With only one Argument in The String


//   static  String Skip2(String str){
//        if(str.isEmpty()){
//            return "";
//        }
//
//        char ch=str.charAt(0);
//
//        if(ch=='a'){
//            return Skip2(str.substring(1));
//        }else{
//            return ch+Skip2(str.substring(1));
//        }
//
//}



//    Skip the particular word or substring of given string

    static String SkipApple(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            return SkipApple(str.substring(5));
        }else{
           return  str.charAt(0)+SkipApple(str.substring(1));
        }


    }



}
