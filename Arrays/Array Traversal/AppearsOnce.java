public class AppearsOnce
{
    public static int appearsOnce(int[] arr)
    {
        int res=0;
        for(int x : arr)
        {
            res^=x;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1,4,6,5,3,5,6,4};
        System.out.println(" Appears Once = "+appearsOnce(arr));
    }    
}
