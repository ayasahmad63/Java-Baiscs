package com.company;

import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Value at index " +i);
             arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Number you want their ceil and floor");
        int num=sc.nextInt();



        int l=0;
        int e=arr.length-1;
        int ceil=0;
        int floor=0;
        while(l<=e){
            int mid=(l+e)/2;

            if(arr[mid]>num){
                e=e-mid;
                ceil=arr[mid];
            }
            else if(arr[mid]<num){
                l=l+mid;
                floor=arr[mid];
            }else{
                ceil=arr[mid];
                floor=arr[mid];
                break;
            }


        }


        System.out.println(ceil);
        System.out.println(floor);





    }
}
