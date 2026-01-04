import java.util.*;

public class TwoSum 
{
    public static int[] twoSum(int[] arr,int target)
    {
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            int sum = arr[left]+arr[right];
            if(sum == target)
            {
                return new int[] {left,right};
            }
            if(sum<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Two Sum = "+Arrays.toString(twoSum(arr,7)));
    }
}
