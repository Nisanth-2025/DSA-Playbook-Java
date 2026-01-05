import java.util.Arrays;

public class ClosestPairToTarget
{
    public static int[] closestTarget(int[] arr,int target)
    {
        int min_diff = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            int sum = arr[left]+arr[right];
            int diff = Math.abs(sum-target);
            if(diff<min_diff)
            {
                l = arr[left];
                r = arr[right];
                min_diff = diff;
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
        return new int[] {l,r};
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,6,7,8};
        System.out.println("Closest Pair= "+Arrays.toString(closestTarget(arr,7)));
    }    
}
