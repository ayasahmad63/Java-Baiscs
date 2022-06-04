package com.company;

import java.util.Arrays;

public class _10_BinarySearchInStrictSorted {
    public static void main(String[] args) {

        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        System.out.println(Arrays.toString(Binary(arr,arr[0].length/2,0,arr.length-1,7)));

    }

    static int[] Binary(int[][] arr,int row,int cstart,int cend,int target){

        while(cstart<=cend){
            int mid=(cstart+cend)/2;

            if(arr[row][mid]==target){
                return  new int[]{row,mid};
            }
            else if(target>arr[row][mid]){
                cstart=mid+1;
            }else{
                cend=mid-1;
            }

        }


        return new int[]{cstart,cend};
    }


}
