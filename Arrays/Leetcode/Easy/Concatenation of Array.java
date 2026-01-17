/**
 * Problem: Concatenation of Array
 * LeetCode: 1929
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/concatenation-of-array/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i=0;i<len;i++)
        {
            ans[i] = ans[i+len] = nums[i];
        }
        return ans;
    }
}