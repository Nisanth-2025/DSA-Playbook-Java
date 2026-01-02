import java.util.*;
public class MoveAllZeros 
{
    public static int[] moveZeros(int[] arr)
    {
        int index = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index] = arr[i];
                index++;
            }
        }
        
        while(index<arr.length)
        {
            arr[index] = 0;
            index++;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = {0,99,19,0,76,32,27,14,9,0,0,39,56,0,55,86,0};
        System.out.println("Re-Structured Array is = "+Arrays.toString(moveZeros(arr)));
    }    
}
