public class MonotonicArray
{
    public static Boolean monotonicArray(int[] arr)
    {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                increasing = false;
            }
            if(arr[i]<arr[i+1])
            {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {23,99,19,46,76,32,27,14,9,204,5,39,56,88,55,86,99};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array1 is "+(monotonicArray(arr1)?"Monotonic":"Not Monotonic"));
        System.out.println("Array2 is "+(monotonicArray(arr2)?"Monotonic":"Not Monotonic"));
    }
}
