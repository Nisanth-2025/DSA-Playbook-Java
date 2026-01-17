/**
 * Problem: Rotate Array
 * LeetCode: 189
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/rotate-array/
 *
 * Pattern: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        k=k%n;
        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);

    }
    public void reverseArray(int[] nums,int left,int right)
    {
        while(left<right)
        {
            int temp = nums[left];
            nums[left] =  nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}