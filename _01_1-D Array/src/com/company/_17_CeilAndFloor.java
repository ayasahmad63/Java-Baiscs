package com.company;

public class _17_CeilAndFloor {
    public static void main(String[] args) {

        int[] matrix={10,20,30,40,50,60,70,80,90,100};
        int target=77;
        int start=0;
        int end=matrix.length-1;

        int ceil=0,floor=0;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target == matrix[mid]){
               floor=mid;
               ceil=mid;
                break;
            }
            else if(target>matrix[mid]){
                start=mid+1;
                floor=mid;
            }
            else if(target<matrix[mid]){
                end=mid-1;
                ceil=mid;

            }


        }

//        ceil=end;
//        floor=start;

        System.out.println( matrix[ceil]+"  "+matrix[floor]);
    }


      }
