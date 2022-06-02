package com.company;

public class DiceTarget {
    public static void main(String[] args) {
Dice(4,"");
    }

    static void Dice(int target,String ans){

        if(target == 0){
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=6&&i<= target;i++){
            Dice(target-i,ans+i);



        }


    }
}
