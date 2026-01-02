/**
 * Problem: Richest Customer Wealth
 * LeetCode: 1672
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/richest-customer-wealth/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(m*n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int row = accounts.length;
        int richest = 0;
        for(int i =0;i<row;i++)
        {
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
            richest = Math.max(richest,sum);
        }
        return richest;
    }
}