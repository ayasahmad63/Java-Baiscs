package com.company;

public class MazeProblem {
    public static void main(String[] args) {
        boolean[][] arr={{true,true,true},
                {true,false,true},
                {true,true,true}};
        Maze(arr,0,0,"");

    }
    static  void Maze(boolean[][] arr,int m,int n,String ans){
        if(m==2 && n==2){
            System.out.println(ans);
            return;
        }

//        if(!arr[m][n]){
//            return;
//        }

        if(m<2){

            Maze(arr,m+1,n,ans+'r');
        }


        if(n<2){

            Maze(arr,m,n+1,ans+'d');
        }
//        if(n>0){
//            Maze(arr,m,n-1,ans+'l');
//        }
//        if(m>0){
//            Maze(arr,m-1,n,ans+'u');
//        }

        if(m<2 && n<2){
            Maze(arr,m+1,n+1,ans+"di");
        }


    }
}
