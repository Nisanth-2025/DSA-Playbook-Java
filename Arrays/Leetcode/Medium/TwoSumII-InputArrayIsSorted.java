/**
 * Problem: Two Sum II - Input Array Is Sorted
 * LeetCode: 167
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * Pattern: Two Pointer
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int left = 0;
        int right = numbers.length-1;
        while(left<right)
        {
            int sum = numbers[left]+numbers[right];
            if(sum == target)
            {
                return new int[] {left+1,right+1};
            }
            if(sum<target)
            {
                left++;
            }
            else
            {
                right--;
            }         
        }
        return new int[]{-1,-1};
    }
}