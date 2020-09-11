package com.ikuei.leetcode.easy.math;

public class LeetCode1295 {
	/*
	 * Easy
	 * 1295. Find Numbers with Even Number of Digits
	 * Given an array nums of integers, return how many of them contain an even number of digits.
	 * 
	 * Input: nums = [12,345,2,6,7896]
	 * Output: 2
	 * Explanation: 
	 * 12 contains 2 digits (even number of digits). 
	 * 345 contains 3 digits (odd number of digits). 
	 * 2 contains 1 digit (odd number of digits). 
	 * 6 contains 1 digit (odd number of digits). 
	 * 7896 contains 4 digits (even number of digits). 
	 * Therefore only 12 and 7896 contain an even number of digits.
	 * 
	 * 倒计耞ず甧计计璝案计肚计+1
	 * 
	 * Example:
	 * 计 = {12,345,2,6,7896}
	 * 12 计 2案计
	 * 345 计 3计
	 * 26 计 1计
	 * 7896 计 4案计
	 * 珿肚 2 (12 and 7896)
	 */
	public static void main(String[] args) {
		int [] input = {555,901,482,1771};
		int res = findNumbers(input);
		System.out.println(res);
	}
	
    public static int findNumbers(int[] nums) {
    	int res = 0;
    	for(int num : nums) {
    		if(String.valueOf(num).length() % 2 == 0) {
    			res++;
    		}
    	}
        return res;
    }
}
