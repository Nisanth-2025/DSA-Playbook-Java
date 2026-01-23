/**
 * Problem: Find Smallest Letter Greater Than Target
 * LeetCode: 744
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 *
 * Pattern: Divide & Conquer
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution 
{
    public char nextGreatestLetter(char[] letters, char target) 
    {
        int left = 0;
        int right = letters.length-1;
        if(letters[right]<=target)
        {
            return letters[0];
        }
        while(left<right)
        {
            int mid = left+(right-left)/2;
            if(letters[mid]>target)
            {
                right = mid;
            }
            else
            {
                left = mid+1;
            }
        }
        return letters[right];    
    }
}