public class SecondLargest 
{
    public static int secondLargest(int[] arr)
    {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int x : arr)
        {
            if(x>first)
            {
                second = first;
                first = x;
            }
            else if(x>second && x !=first)
            {
                second = x;
            }
        }
        return second;
    }
    public static void main(String[] args)
    {
        int[] arr = {23,99,19,46,76,32,27,14,9,204,5,39,56,88,55,86,99};
        System.out.println("Second Largest Element in the Array = "+secondLargest(arr));
    }    
}
