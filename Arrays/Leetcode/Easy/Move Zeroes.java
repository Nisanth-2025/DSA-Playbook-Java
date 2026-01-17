/**
 * Problem: Move Zeroes
 * LeetCode: 283
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/move-zeroes/
 *
 * Pattern: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */ 

class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int slow = 0;
        int len = nums.length;
        for(int fast = 0;fast<len;fast++)
        {
            if(nums[fast]!=0)
            {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        while(slow<len)
        {
            nums[slow] = 0;
            slow++;
        }
    }
}
