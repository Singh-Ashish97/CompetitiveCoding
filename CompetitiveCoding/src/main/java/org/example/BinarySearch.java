package org.example;

public class BinarySearch {
    public static void main(String args[]){
        int[] arr = {-1,0,3,5,9,12};
        System.out.println("Ans: "+search(arr,9));
    }
    public static int search(int[] nums, int target) {
        int j=nums.length-1;
        int i = 0;

        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid]==target) return mid;

            if(target>nums[mid]) i=mid+1;
            else j=mid-1;

        }
        return -1;
    }
}
