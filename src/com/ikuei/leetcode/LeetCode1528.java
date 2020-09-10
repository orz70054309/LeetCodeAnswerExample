package com.ikuei.leetcode;

public class LeetCode1528 {

	public static void main(String[] args) {
		int[] input = {3,1,2,10,1};
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
