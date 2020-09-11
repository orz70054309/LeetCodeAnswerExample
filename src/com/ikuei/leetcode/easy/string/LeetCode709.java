package com.ikuei.leetcode.easy.string;

public class LeetCode709 {
	/*
	 * Easy
	 * 709. To Lower Case
	 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
	 * 
	 * Example 1:
	 * Input: "Hello"
	 * Output: "hello"
	 * 
	 * Example 2:
	 * Input: "LOVELY"
	 * Output: "lovely"
	 */
	public static void main(String[] args) {
		System.out.println(toLowerCase("LOVELY"));

	}

    public static String toLowerCase(String str) {
        return str.toLowerCase(); 
    }
}
