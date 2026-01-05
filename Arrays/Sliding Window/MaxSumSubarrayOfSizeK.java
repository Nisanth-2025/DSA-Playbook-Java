public class MaxSumSubarrayOfSizeK 
{
    public static int maxsumSubArray(int[] arr,int k)
    {
        int n = arr.length;
        if(k>n)
        {
            return -1;
        }
        int max_sum ;
        int k_sum = 0;
        for(int i=0;i<k;i++)
        {
            k_sum+=arr[i];
        }
        max_sum = k_sum;
        for(int j =k;j<n;j++)
        {
            k_sum -= arr[j-k];
            k_sum += arr[j];
            max_sum = Math.max(k_sum,max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1,4,6,5,3,5,6,4};
        System.out.println("Max Sum of Sub-Array = "+maxsumSubArray(arr,4));
        System.out.println("Max Sum of Sub-Array = "+maxsumSubArray(arr,12));
    }    
}
