package com.ikuei.leetcode.easy.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1323 {
	/*
	 * 1323. Maximum 69 Number
	 * Given a positive integer num consisting only of digits 6 and 9.
	 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
	 * 
	 * Example 1:
	 * Input: num = 9669
	 * Output: 9969
	 * Explanation: 
	 * Changing the first digit results in 6669.
	 * Changing the second digit results in 9969.
	 * Changing the third digit results in 9699.
	 * Changing the fourth digit results in 9666. 
	 * The maximum number is 9969.
	 * 
	 * Example 2:
	 * Input: num = 9996
	 * Output: 9999
	 * 
	 * Example 3:
	 * Input: num = 9999
	 * Output: 9999
	 */
	
	public static void main(String[] args) {
		int res = maximum69Number(9999);
		System.out.println(res);
	}

    public static int maximum69Number (int num) {
    	List<Integer> list = new ArrayList<Integer>();
        char[] numCharArray = String.valueOf(num).toCharArray();
        for(int i = 0 ; i < numCharArray.length ; i++) {
        	if(i == 0) {
        		numCharArray[i] = numCharArray[i] == '9' ? '6' : '9';
        		list.add(Integer.valueOf(new String(numCharArray)));
        	} else {
        		numCharArray[i] = numCharArray[i] == '9' ? '6' : '9';
        		numCharArray[i-1] = numCharArray[i-1] == '9' ? '6' : '9';
        		list.add(Integer.valueOf(new String(numCharArray)));
        	}
        }
        
        for(Integer number : list) {
        	if(number > num) {
        		num = number;
        	}
        }
    	return num; 
    }
}
