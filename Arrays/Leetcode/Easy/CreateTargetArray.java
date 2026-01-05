/**
 * Problem: Create Target Array in the Given Order
 * LeetCode: 1389
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/create-target-array-in-the-given-order/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int len = nums.length;
        int[] res = new int[len];
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            arr.add(index[i],nums[i]);
        }
        for(int i=0;i<len;i++)
        {
            res[i] = arr.get(i);
        }
        return res;
    }
}