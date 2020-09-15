package com.ikuei.leetcode.easy.array;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {
	/*
	 * Easy
	 * 1431. Kids With the Greatest Number of Candies
	 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
	 * For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
	 *
	 * Example 1:
	 * Input: candies = [2,3,5,1,3], extraCandies = 3
	 * Output: [true,true,true,false,true] 
	 * Explanation: 
	 * Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids. 
	 * Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids. 
	 * Kid 3 has 5 candies and this is already the greatest number of candies among the kids. 
	 * Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies. 
	 * Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids. 
	 * 
	 * Example 2:
	 * Input: candies = [4,2,1,1,2], extraCandies = 1
	 * Output: [true,false,false,false,false] 
	 * Explanation: There is only 1 extra candy, therefore only kid 1 will have the greatest number of candies among the kids regardless of who takes the extra candy.
	 */
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> res = kidsWithCandies2(candies, extraCandies);
		res.forEach(data -> System.out.print(data + ","));

	}
	
	// no util
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res =  new ArrayList<Boolean>();
        for(int i = 0 ; i < candies.length; i ++) {
        	Boolean isBig = true;
        	int compareNumber = candies[i] + extraCandies;
        	for(int j = 0 ; j < candies.length ; j++) {
        		if(i == j) {
        			continue;
        		} else {
        			if(compareNumber < candies[j]) {
        				isBig = false;
        				break;
        			}
        		}
        	}
        	res.add(isBig);
        }
    	return res;
    }
    
    // util
    public static List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        List<Boolean> res =  new ArrayList<Boolean>();
        int max = 0;
        
        for(int candy : candies) {
        	max = Math.max(candy, max);
        }
        
        for(int candy : candies) {
        	res.add(candy + extraCandies >= max);
        }
        		
    	return res;
    }

}
