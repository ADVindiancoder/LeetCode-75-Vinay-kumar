package com.ADVindiancoder;

public class Solution_1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Solution_1 solution = new Solution_1();
        int[] runningSum = solution.runningSum(nums);
        for (int i = 0; i < runningSum.length; i++) {
            System.out.print(runningSum[i] + " ");
        }
    }
    
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        return runningSum;
    }
}

