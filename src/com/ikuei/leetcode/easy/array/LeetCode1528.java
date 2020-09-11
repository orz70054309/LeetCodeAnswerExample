package com.ikuei.leetcode.easy.array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1528 {
	/*
	 * Easy
	 * 1528. Shuffle String
	 * Given a string s and an integer array indices of the same length.
	 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
	 * Return the shuffled string.
	 * 
	 * Example 1:
	 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
	 * Output: "leetcode"
	 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
	 * 
	 * Example 2:
	 * Input: s = "aaiougrt", indices = [4,0,2,6,7,3,1,5]
	 * Output: "arigatou"
	 */
	public static void main(String[] args) {
		String inputStr = "aaiougrt";
		int[] inputArr = {4,0,2,6,7,3,1,5};
		String res = restoreString(inputStr, inputArr);
		System.out.print("res: " + res);
		
	}
	
    public static String restoreString(String s, int[] indices) {
    	Map<Integer, String> map = new HashMap<Integer, String>();
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i = 0 ; i < s.length() ; i++) {
    		map.put(indices[i], (i+1) == s.length()? s.substring(i) : s.substring(i, i+1));
    	}
    	
    	for(int i = 0 ; i < map.size() ; i++) {
    		sb.append(map.get(i));
    	}
    	
        return sb.toString();
    }
}
