/**
 * Problem: 3Sum Closest
 * LeetCode: 16
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/3sum-closest/
 *
 * Pattern: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int threeSumClosest(int[] nums, int target)
    {
        Arrays.sort(nums);
        int closest_sum = Integer.MAX_VALUE;
        int len = nums.length;
        for(int index=0;index<len-2;index++)
        {
            int left = index+1;
            int right = len-1;
            while(left<right)
            {
                int sum = nums[index]+nums[left]+nums[right];
                if(Math.abs(sum-target)<Math.abs(closest_sum-target))
                {
                    closest_sum = sum;
                }
                if(sum<target)
                {
                    left++;
                }
                else if(sum>target)
                {
                    right--;
                }
                else
                {
                    return sum;
                }
            }
        }
        return closest_sum;  
    }
}