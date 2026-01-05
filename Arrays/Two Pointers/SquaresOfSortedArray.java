import java.util.*;

public class SquaresOfSortedArray 
{
    public static int[] squareArray(int[] arr)
    {
        int len = arr.length;
        int left = 0;
        int right = len-1;
        int sqr_l = 0;
        int sqr_r = 0;
        int index = len-1;
        int[] res = new int[len];
        while(left<=right)
        {
            sqr_l = arr[left]*arr[left];
            sqr_r = arr[right]*arr[right];
            if(sqr_l>sqr_r)
            {
                res[index] = sqr_l;
                left++;
            }
            else
            {
                res[index] = sqr_r;
                right--;
            }
            index--;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {-5,-3,-1,0,1,3,5,7,9};
        System.out.println("Square of sorted Array = "+Arrays.toString(squareArray(arr)));
    }    
}
