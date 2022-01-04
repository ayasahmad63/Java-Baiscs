package com.company.pepcoding;

public class StairsPath {
    public static void main(String[] args) {
        Stairs(3," ");

    }
    static  void Stairs(int target,String ans){
        if(target==0){
            System.out.println(ans);
            return ;
        }

        if(target>=1){
            Stairs(target-1,ans+'1');
        }
        if(target>=2){
            Stairs(target-2,ans+'2');
        }
        if(target>=3){
            Stairs(target-3,ans+'3');
        }


    }









}
