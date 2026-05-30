package org.example;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
    int[] arr = new int[]{3,2,4};
    int target = 6;
    int[] ans = twoSum(arr,target);
    System.out.println(ans[0]+","+ans[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[]{i,map.get(temp)};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
