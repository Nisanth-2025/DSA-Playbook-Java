/**
 * Problem: How Many Numbers Are Smaller Than the Current Number
 * LeetCode: 1365
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 *
 * Pattern: Array Traversal[Complex]
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums)
    {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        int[] copy = nums.clone();
        Arrays.sort(copy);
        ht.put(copy[0],0);
        int index =1;
        for(int i=1;i<copy.length;i++)
        {
            if(copy[i]==copy[i-1])
            {
                index++;
                continue;
            }
            ht.put(copy[i],index);
            index++;
        }
        for(int j=0;j<nums.length;j++)
        {
            copy[j]=ht.get(nums[j]);
        }
        return copy;
    }
}