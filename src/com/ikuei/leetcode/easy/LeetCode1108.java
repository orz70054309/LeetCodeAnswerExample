package com.ikuei.leetcode.easy;

public class LeetCode1108 {
	/*
	 * Easy
	 * 1108. Defanging an IP Address
	 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
	 * 
	 * Example:
	 * Input: address = "1.1.1.1"
	 * Output: "1[.]1[.]1[.]1"
	 * 
	 */
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
