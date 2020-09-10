package com.ikuei.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1480 {

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
