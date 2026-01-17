/**
 * Problem: Build Array from Permutation
 * LeetCode: 1920
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/build-array-from-permutation/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] buildArray(int[] nums) 
    {
        int len = nums.length;
        int[] ans = new int[len];
        for(int i =0;i<len;i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
