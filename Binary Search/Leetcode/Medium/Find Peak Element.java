/**
 * Problem: Find Peak Element
 * LeetCode: 162
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/find-peak-element/
 *
 * Pattern: Divide & Conquer
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution 
{
    public int findPeakElement(int[] nums)
    {
        if(nums.length == 1)
        {
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        while(left<right)
        {
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[mid+1])
            {
                right = mid;
            }
            if(nums[mid]<=nums[mid+1])
            {
                left = mid+1;
            }
        }
        return right;    
    }
}