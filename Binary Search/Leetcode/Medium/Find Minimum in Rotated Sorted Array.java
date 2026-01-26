/**
 * Problem: Find Minimum in Rotated Sorted Array
 * LeetCode: 153
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 *
 * Pattern: Divide & Conquer
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution 
{
    public int findMin(int[] nums)
    {
        int left = 0;
        int right = nums.length-1;
        while(left<right)
        {
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[right])
            {
                left = mid+1;
            }
            else
            {
                right = mid;   
            }
        }
        return nums[left];
    }
}