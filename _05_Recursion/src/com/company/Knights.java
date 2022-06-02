package com.company;

public class Knights {
    public static void main(String[] args) {

        boolean[][] arr={{false,false,false},
                {false,false,false},
                {false,false,false},
                };

        nights(arr,0,0,3);

    }

    static void nights(boolean[][] arr,int row,int col,int knights){

        if(knights==0){
            knightsprints(arr);
            System.out.println(" ");
            return;
        }

        if(row==arr.length-1 && col==arr.length ){
            return;
        }
        if(col== arr.length){
            nights(arr,row+1,0,knights);
            return;
        }

        if(Issafe(arr,row,col)){
            arr[row][col]=true;
            nights(arr,row,col+1,knights-1);
            arr[row][col]=false;
        }
        nights(arr,row,col+1,knights);


    }


    static  boolean Issafe(boolean[][] arr,int row,int col){

        if(Valid(arr,row,col)){
            if(arr[row-2][col+1]){
                return false;
            }
        }

        if(Valid(arr,row,col)){
            if(arr[row-1][col+2]){
                return false;
            }
        }
        if(Valid(arr,row,col)){
            if(arr[row+1][col+2]){
                return false;
            }
        }
        if(Valid(arr,row,col)){
            if(arr[row+2][col+1]){
                return false;
            }
        }
        if(Valid(arr,row,col)){
            if(arr[row+2][col-1]){
                return false;
            }
        }
        if(Valid(arr,row,col)){
            if(arr[row+1][col-2]){
                return false;
            }
        }

        if(Valid(arr,row,col)){
            if(arr[row-1][col-2]){
                return false;
            }
        }

        if(Valid(arr,row,col)){
            if(arr[row-2][col-1]){
                return false;
            }
        }


        return true;
    }


    static boolean Valid(boolean[][] arr,int row,int col){
        if(row>=0 && col>=0 && row<arr.length && col<=arr.length){
            return false;
        }
        return true;
    }



    static  void knightsprints(boolean[][] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                if(arr[i][j]){
                    System.out.print( " K " );
                }else {
                    System.out.print(" - ");
                }

            }
            System.out.println(" ");
        }


    }



}
