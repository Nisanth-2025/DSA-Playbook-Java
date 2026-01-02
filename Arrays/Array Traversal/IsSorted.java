public class IsSorted 
{
    public static boolean isSorted(int[] arr)
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {23,99,19,46,76,32,27,14,9,204,5,39,56,88,55,86,99};
        int[] arr2 = {1,5,9,12,45,66,68,77,99,110,314,555,989};
        System.out.println("The Array is "+(isSorted(arr1)?"Sorted":"Not Sorted"));
        System.out.println("The Array is "+(isSorted(arr2)?"Sorted":"Not Sorted"));
    }
}
