package com.ikuei.leetcode;

public class LeetCode1108 {
	public static void main(String[] args) {
		String address = "1.1.1.1";
		String res = defangIPaddr(address);
			System.out.print("res: " + res);
		
	}
	
    public static String defangIPaddr(String address) {
    	String res = address.replace(".", "[.]");
        return res;
    }
}
