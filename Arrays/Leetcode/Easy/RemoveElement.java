/**
 * Problem: Remove Element
 * LeetCode: 27
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-element/
 *
 * Pattern: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int slow = 0;
        for(int fast = 0;fast<nums.length;fast++)
        {
            if(nums[fast]!=val)
            {
                nums[slow]=nums[fast];
                slow++;
            }
        } 
        return slow; 
    }
}