package com.company.StackPractice;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {

        Stack<Integer>  str =new Stack<>();
        int nums[]={100,80,60,70,60,75,85};

        int[] ans=new int[nums.length];
        ans[0]=1;
        str.push(0);
        for(int i=1;i<nums.length;i++){

            while(str.size()>0 && nums[i]>nums[str.peek()]){
                str.pop();
            }
            if(str.size()==0){
                ans[i]=i+1;
            }
            else{
                ans[i]=i-str.peek();
            }

            str.push(i);
        }
        System.out.println(Arrays.toString(ans));

    }
}
