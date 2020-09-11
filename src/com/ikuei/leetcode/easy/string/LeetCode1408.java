package com.ikuei.leetcode.easy.string;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode1408 {
	/*
	 * Easy
	 * 1408. String Matching in an Array
	 * Given an array of string words. Return all strings in words which is substring of another word in any order. 
	 * String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].
	 * 
	 * Example 1:
	 * Input: words = ["mass","as","hero","superhero"]
	 * Output: ["as","hero"]
	 * Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
	 * ["hero","as"] is also a valid answer.
	 * 
	 * Example 2:
	 * Input: words = ["leetcode","et","code"]
	 * Output: ["et","code"]
	 * Explanation: "et", "code" are substring of "leetcode".
	 * 
	 * Example 3:
	 * Input: words = ["blue","green","bu"]
	 * Output: []
	 * 
	 */
	public static void main(String[] args) {
		String[] input = {"leetcode","et","code"};
		List<String> resList = stringMatching(input);
		resList.forEach(data -> System.out.println(data));
	}
	
    public static List<String> stringMatching(String[] words) {
    	Set<String> res = new HashSet<String>();
    	for(int i = 0 ; i < words.length ; i++) {
    		String word = words[i];
    		int endCount = 0;
    		while(endCount < words.length) {
    			if(i == endCount) {
    				endCount++;
    				continue;
    			}
    			if(word.contains(words[endCount])) {
    				res.add(words[endCount]);
    			}
    			endCount++;
    		}
    	}
    	
		return res.stream().collect(Collectors.toList());
    }

}
