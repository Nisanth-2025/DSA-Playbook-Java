import java.util.*;
public class ThreeSum 
{
    public static List<List<Integer>> threeSum(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        for(int index=0;index<arr.length;index++)
        {
            int left = index+1;
            int right = arr.length-1;
            while(left<right)
            {
                int sum = arr[left]+arr[right]+arr[index];
                if(sum == 0)
                {
                    res.add(Arrays.asList(arr[index],arr[left],arr[right]));
                    left++;
                    right--;
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {-3,-1,0,1,2,3,5,7};
        System.out.println("3 Sum = "+threeSum(arr));
    }
}
