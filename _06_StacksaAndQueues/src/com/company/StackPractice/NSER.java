package com.company.StackPractice;

import java.util.Arrays;
import java.util.Stack;

public class NSER {

    public static void main(String[] args) {
        Stack<Integer> str=new Stack<>();
        int nums[]={1,3,2,4};

        int ans[]=new int[nums.length];

        ans[nums.length-1]=-1;
        str.push(nums[nums.length-1]);
        for(int i=nums.length-2;i>=0;i--) {
            while (str.size() > 0 && nums[i] < str.peek()) {
                str.pop();
            }
            if (str.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = str.peek();
            }

            str.push(nums[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}
