import java.util.*;
public class RemoveDuplicates 
{
    public static int[] removeDuplicates(int[] arr)
    {
        int new_len = 1;
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                new_len++;
            }
        }
        int index = 1;
        int[] new_arr = new int[new_len];
        new_arr[0]=arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                new_arr[index] =arr[i];
                index++; 
            }
        }
        return new_arr;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,1,2,3,4,4,5};
        System.out.println("Array with Duplicates = "+Arrays.toString(arr));
        System.out.println("Array without Duplicates = "+Arrays.toString(removeDuplicates(arr)));
    }
}
