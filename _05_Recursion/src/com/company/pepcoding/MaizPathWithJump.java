package com.company.pepcoding;

public class MaizPathWithJump {

    public static void main(String[] args) {


        MazeJump(3,3,"");

    }


    static void MazeJump(int m,int n,String ans){

     if(m==0 && n==0){
         System.out.println(ans);
         return;
     }


     for(int i=1;i<=m;i++){
         MazeJump(m-i,n,ans+'r'+i);
     }

     for(int j=1;j<=n;j++){
         MazeJump(m,n-j,ans+'d'+j);
     }
     for(int k=1;k<=m && k<=n; k++){
         MazeJump(m-k,n-k,ans+"diag"+k);
     }


    }

}
