package com.ikuei.leetcode;

public class LeetCode1281 {

	public static void main(String[] args) {
		int input = 4421;
		int res = subtractProductAndSum(input);
		System.out.print("res: " + res);
		
	}
	
    public static int subtractProductAndSum(int n) {
    	int res = 0;
    	int multiplyRes = 0;
    	int addRes = 0;
    	char[] charArr = String.valueOf(n).toCharArray();
    	for(int i = 0 ; i < charArr.length ; i++) {
    		if(i == 0) {
    			multiplyRes = Integer.valueOf(String.valueOf(charArr[i]));
    			addRes = Integer.valueOf(String.valueOf(charArr[i]));
    		}else {
    			multiplyRes = multiplyRes * Integer.valueOf(String.valueOf(charArr[i]));
    			addRes += Integer.valueOf(String.valueOf(charArr[i]));
    		}
    	}
    	res = multiplyRes - addRes;
		return res;
    }
}
