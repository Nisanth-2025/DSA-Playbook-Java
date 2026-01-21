/**
 * Problem: Single Element in a Sorted Array
 * LeetCode: 540
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/single-element-in-a-sorted-array/
 *
 * Pattern: Binary Search
 * Time Complexity: O(logn)
 * Space Complexity: O(1)
 */

class Solution 
{
    public int singleNonDuplicate(int[] nums)
    {
        int left = 0;
        int right = nums.length-1;
        while(left<right)
        {
            int mid = left+(right-left)/2;
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1]))
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