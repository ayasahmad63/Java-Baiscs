package com.company.pepcoding;

public class Tracking {
    public static void main(String[] args) {
        int [][] arr={{0,0,0},
                {0,0,0},
                {0,0,0}};
        Track(arr,0,0);
    }

    static void Track(int[][] arr,int row,int col )
    {
        if(row==arr.length){

            fuprint(arr);
            System.out.println(" ");
            return;
        }

        for(int i=0;i<arr.length;i++){
            arr[row][i]=1;
            Track(arr,row+1,col);
            arr[row][i]=0;
        }
    }
        static  void fuprint(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(" " +arr[i][j]);
            }
            System.out.println(" ");

        }
        }


}
