import java.util.Arrays;
public class ReverseArray 
{
    // Use Two Pointer for [Space:O(1)] Efficiency
    public static int[] reverseArray(int[] arr)
    {
        int len = arr.length;
        int[] new_arr = new int[len];
        for(int i = 0;i<len;i++)
        {
            new_arr[i] = arr[len-1-i];
        }
        return new_arr;
    }
    public static void main(String[] args)
    {
        int[] arr = {23,99,19,46,76,32,27,14,9,204,5,39,56,88,55,86,99};
        System.out.println("Reversed Array = "+Arrays.toString(reverseArray(arr)));
    }  
}
