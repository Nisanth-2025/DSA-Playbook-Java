/**
 * Problem: First Bad Version
 * LeetCode: 278
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/first-bad-version/
 *
 * Pattern: Divide and Conquer
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl
{
    public int firstBadVersion(int n) 
    {
        int left = 1;
        int right = n;
        while(left<right)
        {
            int mid = left+(right-left)/2;
            if(isBadVersion(mid))
            {
                right = mid;
            }
            else
            {
                left = mid+1;
            }
        }
        return right;        
    }
}