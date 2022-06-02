package com.company.pepcoding;

public class NQueen {
    public static void main(String[] args) {

        boolean[][] arr={{false,false,false,false},
                         {false,false,false,false},
                         {false,false,false,false},
                         {false,false,false,false}};

        Nqueens(arr,0);


    }
    static void Nqueens(boolean[][] arr,int row){

        if(row==arr.length){
            Nprint(arr);
            System.out.println("");
            return;
        }

        for(int i=0;i<arr.length;i++) {

            if (Issafe(arr, row, i)) {
                arr[row][i] = true;
                Nqueens(arr, row + 1);
                arr[row][i] = false;
            }


        }

    }

     static boolean Issafe(boolean[][] arr,int row,int col)
     {
         for(int i=row;i>=0;i--){
             if(arr[i][col]){
                 return false;
             }
         }

         for(int i=row,j=col;i>=0 && j>=0 ;i--,j--){
             if(arr[i][j]){
                 return false;
             }
         }

         for(int i=row,j=col;i>=0 && j<arr.length; i--,j++)
         {
             if(arr[i][j]){
                 return false;
             }
         }

         return true;
     }






    static void Nprint(boolean[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" - ");
                }


            }
            System.out.println(" ");
        }
    }





}
