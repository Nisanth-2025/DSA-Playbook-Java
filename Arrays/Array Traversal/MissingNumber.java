public class MissingNumber
{
    public static int missingNumber(int[] arr)
    {
        int n = arr.length+1;
        int exp_sum = 0;
        int act_sum = 0;
        for(int i=1;i<=n;i++)
        {
            exp_sum^=i;
        }
        for(int x : arr)
        {
            act_sum^=x;
        }
        return exp_sum^act_sum;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,8,9,10,11,12,13,14,15};
        System.out.println("Missing Number = "+missingNumber(arr));
    }    
}
