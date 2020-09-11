package com.ikuei.leetcode.easy.string;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1309 {
	/*
	 * Easy
	 * 1309. Decrypt String from Alphabet to Integer Mapping
	 * Given a string s formed by digits ('0' - '9') and '#' . 
	 * We want to map s to English lowercase characters as follows:
	 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
	 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively. 
	 * Return the string formed after mapping.
	 * It's guaranteed that a unique mapping will always exist.
	 * 
	 * Example 1:
	 * Input: s = "10#11#12"
	 * Output: "jkab"
	 * Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
	 * 
	 * Example 2:
	 * Input: s = "1326#"
	 * Output: "acz"
	 * 
	 * Example 3:
	 * Input: s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
	 * Output: "abcdefghijklmnopqrstuvwxyz"
	 */
	public static void main(String[] args) {
		
//		System.out.println((char)65); char 'A'
//		System.out.println((char)97); char 'a'
		
		System.out.println(otherAnswer("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
	}

    public static String freqAlphabets(String s) {
    	StringBuffer res = new StringBuffer();
    	int endSubStringIndex = 3;
    	int tmpIndex = 2;
    	int startCharValue = 96;
    	for(int i = 0 ; i < s.length() ; i++) {
    		if(i + endSubStringIndex <= s.length()) {
        		String checkStr = s.substring(i, i + endSubStringIndex);
        		if(checkStr.contains("#")) {
        			int number = Integer.valueOf(new String(checkStr.substring(0, 2)));
        			i += tmpIndex;
        			res.append((char)(startCharValue + number));
        		}
        		else {
        			int number = Integer.valueOf(new String(checkStr.substring(0, 1)));
        			res.append((char)(startCharValue + number));
        		}
    		}
    		else {
        		String tmp = s.substring(i, i + --endSubStringIndex);
        		int number = Integer.valueOf(new String(tmp.substring(0, 1)));
        		res.append((char)(startCharValue + number));
    		}

    	}
    	
		return res.toString();
    }
    
    public static String otherAnswer(String s) {
    	StringBuffer res = new StringBuffer();
    	
    	Map<Integer, Character> map = new HashMap<Integer, Character>();
    	int startCharValue = 96;
    	for(int i = 1 ; i <= 26 ; i++) {
    		map.put(i, (char) (startCharValue + i));
    	}
    	int endSubStringIndex = 3;
    	int tmpIndex = 2;
    	for(int i = 0 ; i < s.length() ; i++) {
    		if(i + endSubStringIndex <= s.length()) {
        		String checkStr = s.substring(i, i + endSubStringIndex);
        		if(checkStr.contains("#")) {
        			int number = Integer.valueOf(new String(checkStr.substring(0, 2)));
        			i += tmpIndex;
        			res.append(map.get(number));
        		}
        		else {
        			int number = Integer.valueOf(new String(checkStr.substring(0, 1)));
        			res.append(map.get(number));
        		}
    		}
    		else {
        		String tmp = s.substring(i, i + --endSubStringIndex);
        		int number = Integer.valueOf(new String(tmp.substring(0, 1)));
        		res.append(map.get(number));
    		}
    	}
    	
    	return res.toString();
    }
}
