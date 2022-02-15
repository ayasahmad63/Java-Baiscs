package com.company.StackPractice;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaRectangle {
    public static void main(String[] args) {

        int[][] arr={{1,0},

        };
        int max=0;
        int[]  num=new int[arr[0].length];
//        System.out.println(Arrays.toString(num));
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                    num[j]=num[j]+1;
                }else{
                    num[j]=0;
                }

            }

            System.out.println(Arrays.toString(num) );
            int n=MAH(num);
            if(n>max)max=n;

        }


        System.out.println(max);
    }
    public static int MAH(int[] arr){
        Stack<Integer> str=new Stack<>();



        int[] ls=new int[arr.length];
        ls[0]=-1;
        str.push(0);
        for(int i=1;i<arr.length;i++){
            while(str.size()>0 && arr[str.peek()]>arr[i]){
                str.pop();
            }
            if(str.size()==0){
                ls[i]=-1;
            }else{
                ls[i]=str.peek();
            }
            str.push(i);
        }


        str=new Stack<>();
        int[] rs=new int[arr.length];
        rs[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            while(str.size()>0 && arr[str.peek()]>arr[i]){
                str.pop();
            }
            if(str.size()==0){
                rs[i]=arr.length;
            }else{
                rs[i]=str.peek();
            }
            str.push(i);
        }

        int max=0;

        for(int i=0;i<arr.length;i++){
            int area=(rs[i]-ls[i]-1)*arr[i];
            if(area>max){
                max=area;
            }

        }




        return max;
    }
}
