/**
 * Problem: Find First and Last Position of Element in Sorted Array
 * LeetCode: 34
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * Pattern: Divide & Conquer
 * Time Complexity: O(logn)
 * Space Complexity: O(1)
 */

class Solution 
{
    public int binary_search(int[] nums, int target,boolean findstart)
    {
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            {
                if(nums[mid]<target)
                {
                    left = mid+1;
                }
                else if(nums[mid]>target)
                {
                    right = mid-1;
                }
                else
                {
                    index = mid;
                    if(findstart)
                    {
                        right = mid-1;
                    }
                    else
                    {
                        left = mid+1;
                    }
                }
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) 
    {
        int result[] = {-1,-1};
        if(nums.length == 0)
        {
            return result;
        }
        result[0] = binary_search(nums,target,true);
        result[1] = binary_search(nums,target,false);
        return result;
    }
}