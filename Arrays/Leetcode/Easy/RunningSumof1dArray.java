/**
 * Problem: Running Sum of 1d Array
 * LeetCode: 1480
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * Pattern: Array Traversal, Prefix-Sum
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int len = nums.length;
        int sum = 0;
        for(int i =0;i<len;i++)
        {
            sum+=nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}