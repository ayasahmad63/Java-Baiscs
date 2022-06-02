package com.company.StackPractice;

import java.util.Arrays;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        Stack<Integer> str=new Stack<>();
        int[] nums={1,1};

        int[] ls=new int[nums.length];

        ls[0]=-1;
        str.push(0);

        for(int i=1;i<nums.length;i++){

            while(str.size()>0 && nums[i]<=nums[str.peek()]){
                str.pop();
            }
            if(str.size()==0){
                ls[i]=-1;
            }else{
                ls[i]=str.peek();
            }

            str.push(i);

        }
        int[] rs=new int[nums.length];

        str=new Stack<>();
        rs[nums.length-1]=nums.length;

        str.push(nums.length-1);
        for(int i=nums.length-2;i>=0;i--){
            while(str.size()>0 && nums[i]<=nums[str.peek()]){
                str.pop();
            }
            if(str.size()==0)
            {
                rs[i]=nums.length;
            }
            else{
                rs[i]=str.peek();
            }
            str.push(i);
        }


        System.out.println(Arrays.toString(rs));
        System.out.println(Arrays.toString(ls));



        int max=0;

        for(int i=0;i<nums.length;i++){
            if(max<((rs[i]-ls[i]-1)*nums[i])){
                max=((rs[i]-ls[i]-1)*nums[i]);
            }
        }
        System.out.println(max);

    }
}
