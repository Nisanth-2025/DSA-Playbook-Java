/**
 * Problem: Add to Array-Form of Integer
 * LeetCode: 989
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/add-to-array-form-of-integer/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        int n = num.length;
        List<Integer> res = new ArrayList<>();
        int curr = k;
        int i = n;
        while(--i>=0 || curr>0)
        {
            if(i>=0)
            {
                curr+=num[i];
            }
            res.add(curr%10);
            curr/=10;
        }
        Collections.reverse(res);
        return res;
    }
}