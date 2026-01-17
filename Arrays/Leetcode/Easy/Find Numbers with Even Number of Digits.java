/**
 * Problem: Find Numbers with Even Number of Digits
 * LeetCode: 1295
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n*d)
 * Space Complexity: O(1)
 */

class Solution {
    public int findNumbers(int[] nums) 
    {
        int even = 0;
        for(int x : nums)
        {
            int count = 0;
            while(x!=0)
            {
                x/=10;
                count++;
            }
            if(count%2==0)
            {
                even++;
            }
        }
        return even;
    }
}