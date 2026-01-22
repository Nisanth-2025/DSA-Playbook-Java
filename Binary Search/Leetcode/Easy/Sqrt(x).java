/**
 * Problem: Sqrt(x)
 * LeetCode: 69
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/sqrtx/
 *
 * Pattern: Divide and Conquer
 * Time Complexity: O(logn)
 * Space Complexity: O(1)
 */

class Solution 
{
    public int mySqrt(int x) 
    {
        if(x==0 || x==1)
        {
            return x;
        }
        int left = 1;
        int right = x/2;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(mid*mid == x)
            {
                return mid;
            }
            if((long)mid*mid > (long)x)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return Math.round(right);
    }
}