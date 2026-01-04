import java.util.*;

public class RemoveDuplicates 
{
    public static int[] removeDuplicates(int[] arr)
    {
        int slow = 1;
        for(int fast=1;fast<arr.length;fast++)
        {
            if(arr[fast]!=arr[fast-1])
            {
                arr[slow]=arr[fast];
                slow++;
            }
        }
        return Arrays.copyOf(arr, slow);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,3,4,4,4,5,6,6,7,8,9};
        System.out.println("Original Array = "+Arrays.toString(arr));
        System.out.println("Removing Duplicates = "+Arrays.toString(removeDuplicates(arr)));
    }
}
