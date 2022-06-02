package com.company;

public class Pattern1 {
    public static void main(String[] args) {

          Pattern(4,0);

    }


    static void  Pattern(int row,int column){

        if(row<1 && column<1){
            return ;
        }
        if(column<row){
            System.out.print(" * ");
            Pattern(row,column+1);
        }
        else{
            System.out.println(" ");
             Pattern(row-1,0);
        }

    }
}
