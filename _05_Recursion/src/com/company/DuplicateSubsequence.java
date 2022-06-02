package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateSubsequence {
    public static void main(String[] args) {
int[] nusm={1,2,2};
List<List<Integer>> ans=Subsequence(nusm);
for(List<Integer> anss:ans){
    System.out.println(anss);
}

    }

    static List<List<Integer>> Subsequence(int [] nums){
        Arrays.sort(nums);
        List<List<Integer>>  ans=new ArrayList<>();

      ans.add(new ArrayList<>());

      int start=0,end=0;

      for(int i=0;i<nums.length;i++) {
          start = 0;
          if (i > 0 && nums[i] == nums[i - 1]) {
              start = end + 1;
          }

          end = ans.size() - 1;
          int n = ans.size();
          for (int j = start; j < n; j++) {
              List<Integer> internal = new ArrayList<>(ans.get(j));
              internal.add(nums[i]);
              ans.add(internal);
          }
      }


    return ans;
    }
}
