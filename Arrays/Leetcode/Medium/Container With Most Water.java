/**
 * Problem: Container With Most Water
 * LeetCode: 11
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/container-with-most-water/
 *
 * Pattern: Array Traversal, Two Pointer, Greedy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxArea(int[] height) 
    {
        int max_sum = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right)
        {
            int diff = Math.abs(right-left);
            int sum = Math.min(height[left],height[right])*diff; 
            if(sum >max_sum)
            {
                max_sum = sum;
            }
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max_sum;
    }
}