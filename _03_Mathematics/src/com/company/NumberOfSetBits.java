package com.company;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n=15;
        int count=0;
        // Method 1:- Extracting last elemnt and comparing to 1 and

//        while(n !=0){
//           if((n&1)==1){
//               count++;
//           }
//            n=n>>1;
//        }


        // Method 2
//        while(n !=0){
//            n=n&(n-1);
//            count++;
//        }

        // Method 3

        while(n !=0){

            n=n-(n&(-n));
            count ++;

        }



        System.out.println(count);


    }
}
