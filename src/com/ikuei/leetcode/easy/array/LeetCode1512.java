package com.ikuei.leetcode.easy.array;

public class LeetCode1512 {
	/*
	 * Easy
	 * 1512. Number of Good Pairs
	 * Given an array of integers nums.
	 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
	 * Return the number of good pairs.
	 * 
	 * Example 1:
	 * Input: nums = [1,2,3,1,1,3]
	 * Output: 4
	 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
	 * 
	 * Example 2:
	 * Input: nums = [1,1,1,1]
	 * Output: 6
	 * Explanation: Each pair in the array are good.
	 * 
	 * Example 3:
	 * Input: nums = [1,2,3]
	 * Output: 0
	 */
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int res = numIdenticalPairs(nums);
		System.out.println(res);
	}

    public static int numIdenticalPairs(int[] nums) {
    	int res = 0;
    	for(int i = 0 ; i < nums.length ; i++) {
    		for(int j = i ; j < nums.length ; j++) {
    			if(nums[i] == nums[j] && i < j) {
    				res++;
    			}
    		}
    	}
        return res;
    }
}
