package com.company.StackPractice;

import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        Stack<Integer> str=new Stack<>();
        int[] nums={6,2,5,4,5,1,6};

        int[] ls=new int[nums.length];

        ls[0]=0;
        





        int[] rs=new int[nums.length];









        int max=0;

        for(int i=0;i<nums.length;i++){
            if(max<((ls[i]-rs[i])*nums[i])){
                max=((ls[i]-rs[i])*nums[i]);
            }
        }


    }
}
