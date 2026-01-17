/**
 * Problem: Remove Duplicates from Sorted Array
 * LeetCode: 26
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Pattern: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int slow = 1;
        int k = 1;
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[slow++]=nums[i];
                k++;
            }
        }
        return k;    
    }
}