/**
 * Problem: Shuffle the Array
 * LeetCode: 1470
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/shuffle-the-array/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int[] res = new int[2*n];
        int left = 0;
        int right = n;
        int i =0;
        while(i<2*n-1)
        {
            res[i] =nums[left];
            res[i+1]=nums[right];
            left++;
            right++;
            i+=2;
        }
        return res;
    }
}