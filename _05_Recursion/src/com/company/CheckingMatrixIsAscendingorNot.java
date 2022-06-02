package com.company;

public class CheckingMatrixIsAscendingorNot {
    public static void main(String[] args) {

        int[] arr={1};
        System.out.println(Check(arr,0));
    }
    static  boolean Check(int[] arr, int i){
        if(arr.length==1 || arr.length==0){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        if(i==arr.length-2){
            return true;
        }



      return  Check(arr,i+1);
    }
}
