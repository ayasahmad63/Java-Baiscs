package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SubsequenceIlteration {
    public static void main(String[] args) {

        int[] nums={1,2,3};
        List<List<Integer>> ans=Subsequence(nums);
        for(List<Integer> list :ans){
            System.out.println(list);
        }


    }
    static List<List<Integer>> Subsequence(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int num:nums){

            int n=ans.size();
            for(int i=0;i<n;i++){
                List<Integer> str=new ArrayList<>(ans.get(i));
                str.add(num);

                ans.add(str);
            }


        }

return ans;

    }
}
