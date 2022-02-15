package com.company.StackPractice;

import java.util.Stack;

public class SlidingWindow {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {

            Stack<Integer> str=new Stack<>();

            int[] ms=new int[nums.length];
            ms[nums.length-1]=nums.length;
            str.push(nums.length-1);
            for(int i=nums.length-2;i>=0;i--){
                while(str.size()>0 && nums[str.peek()]<=nums[i]){
                    str.pop();
                }
                if(str.size()==0){
                    ms[i]=nums.length;
                }else{
                    ms[i]=str.peek();
                }
                str.push(i);
            }
            // System.out.println(Arrays.toString(ms));

            int ans[]=new int[nums.length-k+1];

            int j=0;
            for(int i=0;i<nums.length-k+1;i++){

                if(j<i){
                    j=i;
                }
                while(ms[j]<i+k){
                    j=ms[j];
                }
                ans[i]=nums[j];
            }

            return ans;
        }
    }
}
