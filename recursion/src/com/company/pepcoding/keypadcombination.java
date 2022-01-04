package com.company.pepcoding;

public class keypadcombination {
    public static void main(String[] args) {

        String[] codes={".,","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
       String str="573";
       Keypad(codes,str,"");
    }

    static void Keypad(String[] arr,String s,String ans){

        if(s.isEmpty()){
            System.out.println(ans);
            return ;
        }

        int ch =s.charAt(0)-'0';
        for(int i=0;i<arr[ch].length();i++){

            Keypad(arr,s.substring(1),ans+arr[ch].charAt(i));

        }


    }

    
}
