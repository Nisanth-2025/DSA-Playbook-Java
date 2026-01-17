/**
 * Problem: Median of Two Sorted Arrays
 * LeetCode: 4
 * Difficulty: Hard
 * Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * Pattern: Array Traversal
 * Time Complexity: O((m + n) log(m + n))
 * Space Complexity: O(m+n)
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] res = new int[nums1.length+nums2.length];
        for(int i : nums1)
        {
            arr.add(i);
        }
        for(int j : nums2)
        {
            arr.add(j);
        }
        for(int i=0;i<arr.size();i++)
        {
            res[i]=arr.get(i);
        }
        Arrays.sort(res);
        int len = res.length;
        return (len%2==0)?(res[len/2]+res[(len/2)-1])/2.0:res[len/2];
    }
}