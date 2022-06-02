package com.company.pepcoding;

public class FloodFill {
    public static void main(String[] args) {


        int[][] maze={{0,0,0,0,0,0},
                {0,1,0,1,0,0},
                {0,1,0,0,1,0},
                {0,0,0,0,0,0},
                {0,0,0,1,0,0},
                {0,0,0,0,0,0}
        };

        flood(maze,0,0,"");
    }

    static void flood(int[][] maze,int m,int n,String ans){
        if(m==5&& n==5){
            System.out.println(ans);
            return;

        }
        if(maze[m][n]==1){
            return;
        }

        if(m<5){
            flood(maze,m+1,n,ans+'r');
        }
        if(n<5){
            flood(maze,m,n+1,ans+'d');
        }

    }

}
