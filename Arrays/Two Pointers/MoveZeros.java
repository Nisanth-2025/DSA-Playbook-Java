import java.util.*;

public class MoveZeros 
{
    public static int[] moveZeros(int[] arr)
    {
        int len = arr.length;
        int slow=0;
        for(int fast=0;fast<len;fast++)
        {
            if(arr[fast]!=0)
            {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        while(slow<len)
        {
            arr[slow] = 0;
            slow++;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = {0,2,3,1,0,0,5,3,0,6,0};
        System.out.println("Original Array = "+Arrays.toString(arr));
        System.out.println("After Moving Zeros = "+Arrays.toString(moveZeros(arr)));
    }
}
