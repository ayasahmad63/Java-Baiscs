package com.company.StackPractice;

import java.util.Arrays;
import java.util.Stack;

public class NGERAkternative {
    public static void main(String[] args) {

        Stack<Integer> str=new Stack<>();
        int[] nums={1,3,2,4};

        int[] ans=new int[nums.length];

         str.push(0);
         for(int i=1;i<nums.length;i++){

             while(str.size()>0  &&  nums[i]>nums[str.peek()]){
                int pos=str.peek();
                ans[pos]=nums[i];
                str.pop();


//                        or
//                 ans[str.pop()]=nums[i];
             }
             str.push(i);
         }

         while(str.size()>0){
             ans[str.pop()]=-1;
         }

        System.out.println(Arrays.toString(ans));
    }

}
