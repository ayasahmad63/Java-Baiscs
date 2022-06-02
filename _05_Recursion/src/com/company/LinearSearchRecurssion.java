package com.company;

import java.util.ArrayList;

public class LinearSearchRecurssion {
    public static void main(String[] args) {
        int[] arr={1,4,6,4,4,12,23,64};

        System.out.println(Search(arr,0,4));
    }

//    static  int Search(int arr[],int index,int target){
//        if(index==arr.length){
//            return -1;
//        }
//        if(arr[index]==target){
//            return index;
//        }
//
//        return Search(arr,index+1,target);
//
//
//    }





    static ArrayList Search(int[] arr,int index,int target){

        ArrayList<Integer> list=new ArrayList<>();

        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ans=Search(arr,index+1,target);

        list.addAll(ans);


        return  list;
    }

}
