/**
 * Problem: Number of Good Pairs
 * LeetCode: 1512
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/number-of-good-pairs/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution 
{
    public int numIdenticalPairs(int[] nums)
    {
        int res = 0;
        int[] pairs = new int[101];
        for(int x : nums)
        {
            res+=pairs[x]++;
        }
        return res;
    }
}