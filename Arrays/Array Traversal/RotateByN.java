import java.util.*;
public class RotateByN
{
    public static int[] rotateLeft(int[] arr,int n)
    {
        int len = arr.length;
        int[] rotated = new int[len];
        n=n%len;
        for(int i=0;i<len;i++)
        {
            rotated[i] = arr[(n+i)%len];
        }
        return rotated;
    }
    public static int[] rotateRight(int[] arr,int n)
    {
        int len = arr.length;
        int[] rotated = new int[len];
        n=n%len;
        for(int i=0;i<len;i++)
        {
            rotated[i] = arr[(i-n+len)%len];
        }
        return rotated;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Before Rotation = "+Arrays.toString(arr));
        System.out.println("Left-Rotated Array = "+Arrays.toString(rotateLeft(arr,3)));
        System.out.println("Right-Rotated Array = "+Arrays.toString(rotateRight(arr,3)));
    }  
}
