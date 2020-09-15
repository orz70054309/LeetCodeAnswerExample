package com.ikuei.leetcode.easy.array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1480 {
	/*
	 * Easy
	 * 1480. Running Sum of 1d Array
	 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]¡Knums[i]).
	 * Return the running sum of nums.
	 * 
	 * Example 1:
	 * Input: nums = [1,2,3,4]
	 * Output: [1,3,6,10]
	 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
	 * 
	 * Eample 2:
	 * Input: nums = [1,1,1,1,1]
	 * Output: [1,2,3,4,5]
	 */
	public static void main(String[] args) {
		int[] input = {1,1,1,1,1};
		int[] res = runningSum(input);
		for(int i : res) {
			System.out.print(i);
			System.out.print(",");
		}
		
	}
	
    public static int[] runningSum(int[] nums) {
    	int[] res = new int[nums.length];
    	
    	for(int i = 0 ; i < nums.length ; i++) {
    		if(i == 0) {
    			res[i] = nums[i];
    		}else {
    			res[i] = nums[i] + res[i-1];
    		}
    	}
    	
		return res;
    }

}
