package com.company;

import java.util.Scanner;

public class ShellRotate {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr={
                {1,2,3,4,5},
                {6,7,8,9,10,},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        System.out.println("Enter the shell you want to rotate");
        int s=sc.nextInt();
        System.out.println("Enter the Number how much you want to rotate");
        int r= sc.nextInt();





        display(arr);
        System.out.println(" ");

        sinarrcon(arr,s,r);
        System.out.println(" ");
        display(arr);

    }
    static  void sinarrcon(int[][]  arr, int s,int r){
        int  minr=s-1;
        int minc=s-1;

        int maxr=arr.length-s;
        int maxc=arr[0].length-s;


        int size=2*((maxc+maxr)-(minc+minr));
        int[] singlearr=new int[size];
        r=r+size;
        r=r%size;

      //  Convert Shell to Single Array

        shelltoarray(arr,singlearr,minr,minc,maxc,maxr,s);
       //
         sindisplay(singlearr);
       // singlearrayRotate to rotate shell
        rotate(singlearr,0,singlearr.length-1-r);

        rotate(singlearr,singlearr.length-r,singlearr.length-1);

        rotate(singlearr,0,singlearr.length-1);

        //  array now rotate according to ourself

        System.out.println(" ");

        sindisplay(singlearr);
        System.out.println(" ");
        //Convert SingleArray tp Shell

        arrtoshell(arr,singlearr,minr,minc,maxc,maxr,s);




    }


    static  void shelltoarray(int[][] arr,int[] singlearr,int minr,int minc,int maxc,int maxr,int s){
//        Filling  value in Indexes
        int indx=0;
        // LR
        for(int i=minr,j=minc;i<=maxr;i++){
            singlearr[indx]=arr[i][j];
            indx++;
        }

        // BC
        for (int i=maxr ,j=minc+1;j<=maxc;j++){
            singlearr[indx]=arr[i][j];
            indx++;
        }
        //RC
        for(int i=maxr-1,j=maxc;i>=s-1;i--){
            singlearr[indx]=arr[i][j];
            indx++;
        }
        //UC
        for(int i=minr ,j=maxc-1;j>s-1;j--){
            singlearr[indx]=arr[i][j];
            indx++;
        }





    }

    static void  rotate(int[] singlearr,int s,int e){

       while(s<e){
           singlearr[s]=singlearr[s]+singlearr[e];
           singlearr[e]=singlearr[s]-singlearr[e];
           singlearr[s]=singlearr[s]-singlearr[e];

           s++;
           e--;
       }


    }



static  void arrtoshell(int[][] arr,int[] singlearr,int minr,int minc,int maxc,int maxr,int s){
//    Filling  value in Indexes
    int indx=0;
    // LR
    for(int i=minr,j=minc;i<=maxr;i++){
       arr[i][j] =singlearr[indx];
        indx++;
    }

    // BC
    for (int i=maxr ,j=minc+1;j<=maxc;j++){
        arr[i][j]=singlearr[indx];
        indx++;
    }
    //RC
    for(int i=maxr-1,j=maxc;i>=s-1;i--){
        arr[i][j]=singlearr[indx];
        indx++;
    }
    //UC
    for(int i=minr ,j=maxc-1;j>s-1;j--){
        arr[i][j]=singlearr[indx];
        indx++;
    }




}

static void display(int[][] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println(" ");
        }


    }



static  void sindisplay(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
}













}
