package com.ikuei.leetcode.easy.string;

public class LeetCode344 {
	/*
	 * Easy
	 * 344. Reverse String
	 * Write a function that reverses a string. The input string is given as an array of characters char[].
	 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
	 * You may assume all the characters consist of printable ascii characters.
	 * 
	 * Example 1:
	 * Input: ["h","e","l","l","o"]
	 * Output: ["o","l","l","e","h"]
	 * 
	 * Example 2:
	 * Input: ["H","a","n","n","a","h"]
	 * Output: ["h","a","n","n","a","H"]
	 */
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
	}
	
    public static void reverseString(char[] s) {
    	// 1. util
        StringBuilder sb = new StringBuilder(new String(s));
        System.out.println(sb.reverse());
        
        // 2. for loop
        for(int i = (s.length - 1) ; i >= 0 ; i--) {
        	System.out.print(s[i]);
        }
        System.out.println();
        
        // 3. recursive
        System.out.print(recursiveString(new String(s)));

    }
    
    public static String recursiveString(String s) {
		return s.isEmpty() ? "" : recursiveString(s.substring(1)) + s.charAt(0);
    }
    
    

}
