/**
 * Problem: Happy Number
 * LeetCode: 202
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/happy-number/
 *
 * Pattern: Array Traversal, Math
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.*;

class Solution {
    public boolean isHappy(int n) 
    {
        int sum;
        int split = 0;
        while(n!=1 && n!=7)
        {
            if(n<10)
            {
                return false;
            }
            sum = 0;
            while(n!=0)
            {
                split = n%10;
                sum += split*split;
                n = n/10;
            }
            n = sum;
        }
        return true;
    }
}