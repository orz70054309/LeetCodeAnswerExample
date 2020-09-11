package com.ikuei.leetcode.easy;

public class LeetCode1281 {
	/*
	 * Easy
	 * 1281. Subtract the Product and Sum of Digits of an Integer
	 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
	 * 
	 * 倒计
	 * 计 - 计 = 肚
	 * 
	 * Example:
	 * 计234
	 * 肚 = (2 * 3 * 4) - (2 + 3 + 4)
	 */
	public static void main(String[] args) {
		int input = 234;
		int res = subtractProductAndSum(input);
		System.out.print("res: " + res);
		
	}
	
    public static int subtractProductAndSum(int n) {
    	int res = 0;
    	int multiplyRes = 0;
    	int addRes = 0;
    	char[] charArr = String.valueOf(n).toCharArray();
    	for(int i = 0 ; i < charArr.length ; i++) {
    		if(i == 0) {
    			multiplyRes = Integer.valueOf(String.valueOf(charArr[i]));
    			addRes = Integer.valueOf(String.valueOf(charArr[i]));
    		}else {
    			multiplyRes = multiplyRes * Integer.valueOf(String.valueOf(charArr[i]));
    			addRes += Integer.valueOf(String.valueOf(charArr[i]));
    		}
    	}
    	res = multiplyRes - addRes;
		return res;
    }
}
