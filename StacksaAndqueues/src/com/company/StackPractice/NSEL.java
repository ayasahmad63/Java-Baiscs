package com.company.StackPractice;

import java.util.Arrays;
import java.util.Stack;

public class NSEL {
    public static void main(String[] args) {

        Stack<Integer> str=new Stack<>();

        int[] nums={4,5,2,10,8};
        int[] ans=new int[nums.length];

        ans[0]=-1;
        str.push(nums[0]);
        for(int i=1;i<nums.length;i++){

            while (str.size()>0 && str.peek()>nums[i]){
                str.pop();
            }

            if(str.size()==0){
                ans[i]=-1;

            }else{
                ans[i]=str.peek();
            }

            str.push(nums[i]);
        }


        System.out.println(Arrays.toString(ans));

    }
}
