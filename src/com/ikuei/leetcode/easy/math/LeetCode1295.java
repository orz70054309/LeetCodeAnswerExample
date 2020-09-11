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
	 * ���@�ƦC�A�P�_���e�ƭӼƭY�����ơA�^�Ǽ�+1
	 * 
	 * Example:
	 * �ƦC = {12,345,2,6,7896}
	 * 12 �ӼƬ� 2�A������
	 * 345 �ӼƬ� 3�A���_��
	 * 2�B6 �ӼƬ� 1�A���_��
	 * 7896 �ӼƬ� 4�A������
	 * �G�^�� 2 (12 and 7896)
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
