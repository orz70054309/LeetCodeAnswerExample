package com.ikuei.leetcode.easy.string;

public class LeetCode1221 {
	/*
	 * Easy
	 * 1221. Split a String in Balanced Strings
	 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.Given a balanced string s split it in the maximum amount of balanced strings.
	 * Return the maximum amount of splitted balanced strings.
	 * 
	 * Example 1:
	 * Input: s = "RLRRLLRLRL"
	 * Output: 4
	 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
	 * 
	 * Example 2:
	 * Input: s = "RLLLLRRRLR"
	 * Output: 3
	 * Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "RLRRRLLRLL";
		System.out.println(balancedStringSplit(input));
	}

    public static int balancedStringSplit(String s) {
    	int resCount = 0;
        int rightCount = 0;
        int leftCount = 0;
        String sub = "";
        for(int i = 0 ; i < s.length() ; i++) {
        	if(i == 0) {
        		sub = s.substring(i, i+1);
        		if(sub.equals("R")) {
        			rightCount++;
        		} else {
        			leftCount++;
        		}
        	}else {
        		String tmpStr = s.substring(i, i+1);
        		if(tmpStr.equals("R")) {
        			rightCount++;
        		} else {
        			leftCount++;
        		}
        		
        		if(rightCount == leftCount) {
        			resCount++;
        			sub = "";
        		} else {
        			sub += tmpStr;
        		}
        	}

        }
        
    	return resCount;
    }
}
