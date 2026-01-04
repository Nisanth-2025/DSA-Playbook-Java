import java.util.*;

public class PairWithGivenSum 
{
    public static int[] pairSum(int[] arr,int target)
    {
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            int sum = arr[left]+arr[right];
            if(sum == target)
            {
                return new int[] {arr[left],arr[right]};
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
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Pair with Given Sum = "+Arrays.toString(pairSum(arr,7)));
    }   
}
