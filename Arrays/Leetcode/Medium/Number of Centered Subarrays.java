/**
 * Problem: Number of Centered Subarrays
 * LeetCode: 3804
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/number-of-centered-subarrays/
 *
 * Pattern: Array Traversal, Hashing
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */

import java.util.*;

class Solution 
{
    public int centeredSubarrays(int[] nums) 
    {
        int len = nums.length;
        int centered = len;
        for(int i = 0;i<len-1;i++)
        {
            HashSet<Integer> res = new HashSet<>();
            int sum = 0;
            res.add(nums[i]);
            sum += nums[i];
            for(int j = i+1;j<len;j++)
            {
                res.add(nums[j]);
                sum+=nums[j];
                if(res.contains(sum))
                {
                    centered++;
                }
            }
        }
        return centered;
    }
}