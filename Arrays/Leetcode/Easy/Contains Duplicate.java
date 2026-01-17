/**
 * Problem: Contains Duplicate
 * LeetCode: 217
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/contains-duplicate/
 *
 * Pattern: Array Traversal, HashSet
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        HashSet<Integer> res = new HashSet<>();
        for(int x : nums)
        {
            if(res.contains(x))
            {
                return true;
            }
            res.add(x);
        }
        return false;
    }
}