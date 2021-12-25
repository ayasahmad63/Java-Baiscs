package com.company;

public class RBS {
    public static void main(String[] args) {

        int[] arr={4,5,6,7,8,9,1,2,3};

        System.out.println(Rbs(arr,0, arr.length-1,7));
    }

    static int Rbs(int[] arr,int s,int e,int target){
        if(s<e){
            return -1;
        }
        int mid=s+(e-s)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[s]<=arr[mid]) {

            if (target >= arr[s] && target <= arr[mid]) {
                return Rbs(arr, s, mid - 1, target);
            } else {
                return Rbs(arr, mid + 1, e, target);
            }
        }
            if(target>=arr[mid] && target<=arr[e]){
                return Rbs(arr,mid+1,e,target);
            }
            else{
                return Rbs(arr,s,mid-1,target);
            }


    }


}
