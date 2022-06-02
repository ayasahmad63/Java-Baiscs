package com.company;

public class Pattern2 {
    public static void main(String[] args) {


    }
    static void Pattern(int row,int column){
        if(row<1 && column<1){
            return;
        }

        if(row<column){
            System.out.print(" * ");
            Pattern(row+1,column);
        }else{
            System.out.println(" ");
            Pattern(row,column-1);
        }
    }
}
