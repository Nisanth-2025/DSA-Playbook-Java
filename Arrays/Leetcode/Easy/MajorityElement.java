/**
 * Problem: Majority Element
 * LeetCode: 169
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/majority-element/
 *
 * Pattern: Boyer–Moore Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.*;

class Solution {
    public int majorityElement(int[] nums) 
    {
        int num = 0;
        int count = 0;
        for(int n : nums)
        {
            if(count == 0)
            {
                num = n;
            }
            count+= (num == n ?1:-1);
        }
        return num;   
    }
}