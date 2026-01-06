/**
 * Problem: 3Sum
 * LeetCode: 15
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/3sum/
 *
 * Pattern: Two Pointer
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        for(int index = 0;index<len;index++)
        {
            if(index>0 && nums[index] == nums[index-1])
            {
                continue;
            }
            int left = index+1;
            int right = len-1;
            while(left<right)
            {
                int sum = nums[index]+nums[left]+nums[right];
                if(sum == 0)
                {
                    res.add(Arrays.asList(nums[index],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1])
                    {
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1])
                    {
                        right--;
                    }
                }
                else if (sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return res;
    }
}