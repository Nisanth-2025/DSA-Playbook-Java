/**
 * Problem: Boats to Save People
 * LeetCode: 881
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/boats-to-save-people/
 *
 * Pattern: Two Pointers
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        Arrays.sort(people);
        int min = 0;
        int left = 0;
        int right = people.length-1;
        while(left<=right)
        {
            int sum = people[left] + people[right];
            if(sum<=limit)
            {
                left++;
                right--;
            }
            else
            {
                right--;
            }
            min++;            
        }
        return min;    
    }
}
