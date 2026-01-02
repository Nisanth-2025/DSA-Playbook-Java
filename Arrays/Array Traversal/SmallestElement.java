public class SmallestElement 
{
    public static int minElement(int[] arr)
    {
        int min = arr[0];
        for(int x : arr)
        {
            min= Math.min(x,min);
        }
        return min;
    }
    public static void main(String[] args)
    {
        int[] arr = {23,99,19,46,76,32,27,14,9,204,5,39,56,88,55,86,99};
        System.out.println("Smallest Element in the Array = "+minElement(arr));
    }
}
